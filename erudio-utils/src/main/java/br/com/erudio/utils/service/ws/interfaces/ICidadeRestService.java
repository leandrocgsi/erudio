package br.com.erudio.utils.service.ws.interfaces;

import br.com.erudio.utils.database.beans.BeanCidade;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(br.com.erudio.utils.service.ws.ServiceName.CIDADE_SERVICE)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public interface ICidadeRestService {

    @POST
    @Path("/save")
    Integer saveCidade(BeanCidade cidade);

    @PUT
    @Path("/update")
    void updateCidade(BeanCidade cidade);

    @POST
    @Path("/delete")
    void deleteCidade(BeanCidade cidade);

    @GET
    @Path("/find")
    List<BeanCidade> findAllCidades();

    @GET
    @Path("/findbyid/{id}")
    BeanCidade findCidadeById(@PathParam("id") Integer id);
}
