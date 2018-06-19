package se.claudiastenberg.tomcla.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.claudiastenberg.tomcla.model.User;

/**
 * Inteface CRUD
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
}
