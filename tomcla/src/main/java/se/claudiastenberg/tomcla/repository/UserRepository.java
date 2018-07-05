package se.claudiastenberg.tomcla.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.claudiastenberg.tomcla.model.User;

import java.util.Optional;

/**
 * Inteface CRUD
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    Optional<User> findByIdNumber(Long idNumber);
}
