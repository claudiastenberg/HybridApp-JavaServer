package se.claudiastenberg.tomcla.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.claudiastenberg.tomcla.model.User;
import se.claudiastenberg.tomcla.service.UserService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * UserResource connection between service and web
 */

@Component
@Path("users")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XHTML_XML})
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    private final UserService service;
    @Context
    private UriInfo uriInfo;

    @Autowired
    public UserResource(UserService service) {
        this.service = service;
    }

    @POST
    public Response createUser(User user){
        service.createUser(user);
        return Response.ok().build();
    }
    @GET
    @Path("{idNumber}")
    public Response getUser(@PathParam("idNumber") Long idNumber){
        return Response.ok(service.getUserByIdNumber(idNumber)).build();
    }
    @GET
    public Response getUsers(){
        service.getallUsers();
        return Response.ok(service.getallUsers()).build();
    }
}
