package se.claudiastenberg.tomcla.resource;

import org.springframework.stereotype.Component;
import se.claudiastenberg.tomcla.model.User;
import se.claudiastenberg.tomcla.service.UserService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * UserResource connection between service and web
 */

@Component
@Path("users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    private final UserService service;
    @Context
    private UriInfo uriInfo;

    public UserResource(UserService service) {
        this.service = service;
    }

    @POST
    public Response createUser(User user){
        service.createUser(user);
        return Response.ok().build();
    }
}
