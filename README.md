# Erudio

Aplicação multicamada, com suporte a Mobile, Desktop e Web ainda em desenvolvimento. Envolvendo as tecnologias Hibernate, Spring, Maven, SWING, JSF, JSON, XML e Android.

[![Build Status](https://travis-ci.org/leandrocgsi/erudio.svg?branch=master)](https://travis-ci.org/leandrocgsi/erudio)
[![Build Status](https://circleci.com/gh/leandrocgsi/erudio.svg?&style=shield)](https://circleci.com/gh/leandrocgsi/erudio/)

![Application Architecture](https://github.com/leandrocgsi/erudio/blob/master/img/image1.png?raw=true)

A figura acima representa a especificação da arquitetura base para o desenvolvimento, do sistema Erudio. A aplicacão agora é distribuída, existe uma aplicação servidora responsável por acessar a base de dados, validar regras de negócio e disponibilizar serviços para outras aplicações cliente. Na figura acima o servidor é representado pelo “Erudio Server”. Como clientes temos dois web e um desktop.
O cliente desktop, “Erudio Desktop Client” , se comunica com o servidor por RMI como toda a regra de negócio fica concentrada no servidor basicamente só é necessário implementar a camada de visão. 
O cliente “Erudio Web Client” também se comunica via RMI e a parte de layout é desenvolvida utilizando-se das tecnologias JSF e Primefaces. Questões de segurança nessa aplicação são tratadas pelo Spring Security 3.1., nesse caso as credenciais do usuário são verificadas no server, para esse propósito é necessário sobrescrever a UserDetails. 
Completando a lista de clientes temos o “Erudio WS-Exporter Client” que se comunica via RMI com o server e disponibiliza web-services REST para clientes mobile ou em linguagens diferentes de Java. Mais uma vez as questões de segurança são providas pelo Spring Security 3.1., onde as credenciais do usuário são verificadas no server, só que agora foi necessário sobrescrever a AuthenticationProvider. Além desses, novos clientes podem ser facilmente adicionados.
Para adicionar novos clientes podemos agir de três diferentes formas:
- Desenvolver um novo cliente Java utilizando o protocolo RMI;
- Desenvolver um novo cliente Java utilizando um novo protocolo, o que implica em alterações no server;
- Pode-se ainda desenvolver um cliente que consuma os web-serviçes disponibilizados pelo “Erudio WS-Exporter Client”, esse cliente pode ser em qualquer linguagem ou plataforma. Isto é válido também para clientes mobile, visto que originalmente só foi implementada a solução para Android.
Essa nova abordagem trás uma série de vantagens dentre elas, maior segurança visto que os clientes conhecem apenas o “contrato” para se comunicar com o servidor ficando alheios à questões de banco de dados, regras de negócio ou implementação. Além disso permite que a equipe de desenvolvimento conheça apenas a parte do software com a qual trabalha, isso facilita o processo de treinamento de um novo membro da equipe bem como evita cópias de código por parte de um desenvolvedor mal intencionado. 

# O “Erudio Server”

O server é onde se concentra os projetos de maior complexidade da aplicação, são eles que gerenciam as regras de negócio, o acesso a base de dados e claro, disponibiliza os serviços. O server de divide em cinco projetos, o Business, o Database, o Factory, o Service e o Utils. 
O Business é responsável por gerenciar as regras de negócio, o Database é responsável por acessar a base de dados e realizar os CRUD's, o factory é responsável por levantar a aplicação, o Service é responsável por disponibilizar os serviços internamente no Server e por fim o Utils é o responsável por disponibilizar os serviços externamente.
A figura abaixo representa a estrutura de projetos e pacotes nos quais o Server se subdivide. Todos eles são altamente coesos e possuem baixo acoplamento, sendo que a comunicação entre os projetos é totalmente orientada a interface. 
O projeto Factory é o responsável por inicializar a aplicação e por isso ele importa os projetos, Business, Service e Database. O projeto Database, por sua vez, é o responsável por acessar a base de dados e manipular as informações. É nele que estão os DAO’s, as entidades, o parser de bean para entidade e dos serviços em DAO’s concretos. O Business é onde serão implementadas as regras de negócio da aplicação, entretanto ainda não foi realizada nenhuma implementação nesse sentido. 

![Estrutura de Projetos e Pacotes do Server](https://github.com/leandrocgsi/erudio/blob/master/img/image2.png?raw=true)

O Service por sua vez contém a implementação das ações disponibilizadas pelas interfaces do Utils. Por fim o Utils é o responsável por disponibilizar beans, interfaces dos serviços e interfaces dos web-services, sendo que ele é o único projeto do Server acessível pelos clientes. Apesar das interfaces dos serviços e dos web-services, basicamente, serem diferentes apenas nas anotações que as últimas possuem esta é a melhor opção pois como o todos os beans no Spring são singletons ocorreriam problemas durante o desenvolvimento do cliente responsável por disponibilizar os web-serviçes.

# O “Erudio-Erudio-factory”

O projeto Factory é responsável por ler os arquivos de contexto do Spring. Sua implementação é bem simples e temos apenas o método main que invoca o método startApplication da classe FactoryDistribution que por sua vez implementa a interface IfactoryDistribution e é responsável por  inicializar a aplicação.


![Estrutura de Projetos e Pacotes do Server](https://github.com/leandrocgsi/erudio/blob/master/img/image3.png?raw=true)

# O “Erudio-Erudio-business”

Até o momento não temos nenhuma implementação da business entretanto é ela que conterá as regras de negócio da aplicação.

# O “Erudio-Erudio-service”

![Estrutura de Projetos e Pacotes do Server](https://github.com/leandrocgsi/erudio/blob/master/img/image4.png?raw=true)

O projeto Service é o responsável por criar os serviços que contém as implementações das interfaces que são disponibilizadas pelo projeto Utils. Tecnicamente para cada entidade do banco de dados haverá um serviço. O diagrama que representa os serviços é similar à imagem acima, aqui apresentamos apenas um serviço para fins de simplificação. 

 
# O “Erudio-Erudio-database”

![Estrutura de Projetos e Pacotes do Server](https://github.com/leandrocgsi/erudio/blob/master/img/image5.png?raw=true)

O projeto Database é o mais complexo do Server, é nele que estão os DAO's, as entidades, o parser de bean para entidade e a factory dos serviços. Temos o serviço e o DAO genéricos que realizam operações básicas de acesso a dados,  sendo que estes são estendidos e seus métodos podem ser sobrescritos pelos DAO's e serviços específicos de cada entidade.
A classe ParserDatabase é responsável por converter um bean em uma  entidade. Isto é necessário por que, por questões de segurança, apenas os beans são acessíveis pelos os clientes. Dessa forma os clientes desconhecem as entidades da aplicação e por consequência a estrutura da base de dados, provendo, assim, maior segurança para a aplicação. Para realizar o processo de parser utiliza-se a dependência Dozer. Por fim temos uma Factory responsável por criar os serviços.

# O “Erudio-Erudio-utils”

O Utils por sua vez é o único projeto que é acessível pelos clientes. Ele é o responsável por prover a comunicação entre os demais projetos do Server e seus clientes. Nele só existem classes puras, beans, enuns e interfaces.

![Estrutura de Projetos e Pacotes do Server](https://github.com/leandrocgsi/erudio/blob/master/img/image6.png?raw=true)

Os beans são correspondentes às entidades do Database, para cada entidade existe um bean, todos eles herdam de BaseBean. Além deles temos as interfaces dos serviços e do database. Para cada bean ou entidade temos uma interface que estabelece o “contrato” de comunicação dos clientes com o server. Por fim temos as constantes, com o endereço, de cada web-service disponibilizado e as interfaces responsáveis pelo “contrato” de disponibilização dos mesmos.
