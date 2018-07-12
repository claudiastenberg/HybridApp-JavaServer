package se.claudiastenberg.tomcla.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.claudiastenberg.tomcla.model.Consult;

@Repository
public interface ConsultRepository extends CrudRepository<Consult, Long> {
}
