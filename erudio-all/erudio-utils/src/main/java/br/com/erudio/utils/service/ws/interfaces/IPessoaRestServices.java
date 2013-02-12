package br.com.erudio.utils.service.ws.interfaces;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import br.com.erudio.utils.database.beans.BeanPessoa;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(br.com.erudio.utils.service.ws.ServiceName.PESSOA_SERVICE)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public interface IPessoaRestServices {

    @POST
    @Path("/save")
    Integer savePessoa(BeanPessoa pessoa);

    @PUT
    @Path("/update")
    void updatePessoa(BeanPessoa pessoa);

    @POST
    @Path("/delete")
    void deletePessoa(BeanPessoa pessoa);

    @GET
    @Path("/find")
    List<BeanPessoa> findAllPessoas();

    @GET
    @Path("/findbyid/{id}")
    BeanPessoa findCidadeById(@PathParam("id") Integer id);
}
