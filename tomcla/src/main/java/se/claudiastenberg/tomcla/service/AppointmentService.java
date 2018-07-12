package se.claudiastenberg.tomcla.service;

import org.springframework.stereotype.Service;
import se.claudiastenberg.tomcla.model.Appointment;
import se.claudiastenberg.tomcla.repository.Appointmentrepository;

@Service
public class AppointmentService {

    private final Appointmentrepository appointmentrepository;

    public AppointmentService(Appointmentrepository appointmentrepository) {
        this.appointmentrepository = appointmentrepository;
    }

    /*Create a user*/
    public Appointment createAppointment(Appointment appointment){
        return appointmentrepository.save(appointment);
    }

    /*Get all Users*/
    public Iterable<Appointment> getallAppoinments(){
        return appointmentrepository.findAll();
    }
}
