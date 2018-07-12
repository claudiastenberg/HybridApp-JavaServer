package se.claudiastenberg.tomcla.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.claudiastenberg.tomcla.model.Appointment;
import se.claudiastenberg.tomcla.service.AppointmentService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Component
@Path("appointment")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XHTML_XML})
@Produces(MediaType.APPLICATION_JSON)
public class AppointmentResource {

    private final AppointmentService service;

    @Context
    private UriInfo uriInfo;

    @Autowired
    public AppointmentResource(AppointmentService service) {
        this.service = service;
    }

    @POST
    public Response createAppointment(Appointment appointment){
        service.createAppointment(appointment);
        return Response.ok().build();
    }

    @GET
    public Response getAllAppointment(){
        service.getallAppoinments();
        return Response.ok(service.getallAppoinments()).build();
    }
}
