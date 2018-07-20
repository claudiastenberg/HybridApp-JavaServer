package se.claudiastenberg.tomcla.service;

import org.springframework.stereotype.Service;
import se.claudiastenberg.tomcla.model.Appointment;
import se.claudiastenberg.tomcla.repository.Appointmentrepository;

/**
* The Appointment is a booked time that a consult have done. It can be a doctor appoinment or a nurse appoinment.
* When the user/patient come to the appoinment they will check in by write their personal ID number
 * */
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
