package se.claudiastenberg.tomcla.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.claudiastenberg.tomcla.model.Appointment;

@Repository
public interface Appointmentrepository extends CrudRepository<Appointment, Long>{
}
