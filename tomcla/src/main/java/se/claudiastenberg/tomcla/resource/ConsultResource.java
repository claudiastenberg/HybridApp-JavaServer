package se.claudiastenberg.tomcla.resource;


import org.springframework.stereotype.Component;
import se.claudiastenberg.tomcla.model.Consult;
import se.claudiastenberg.tomcla.service.ConsultService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
@Path("consults")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XHTML_XML})
@Produces(MediaType.APPLICATION_JSON)
public class ConsultResource {

    private final ConsultService service;

    public ConsultResource(ConsultService service) {
        this.service = service;
    }

    @POST
    public Response createConsult(Consult consult){
        service.createConsut(consult);
        return Response.ok().build();
    }
    @GET
    public Response getAllConsults(){
        service.getAllConsults();
        return  Response.ok(service.getAllConsults()).build();
    }
}
