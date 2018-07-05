package se.claudiastenberg.tomcla.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.claudiastenberg.tomcla.model.User;
import se.claudiastenberg.tomcla.repository.UserRepository;

import javax.ws.rs.NotFoundException;
import java.util.List;
import java.util.Optional;

/**
 * Layer that take care off all request from the web. Service handle what too do with them.
 * We want to have Sign in and Log in!
 */

@Service
public class UserService {

    @Autowired
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    /*Create a user*/
    public User createUser(User user){
        return repository.save(user);
    }
    /*Get all Users*/
    public Iterable<User> getallUsers(){
        return repository.findAll();
    }
    /*TODO; Get User with idNumber*/
    public User getUserByIdNumber(Long idNumber){
        Optional<User> optional = repository.findByIdNumber(idNumber);
        if (optional.isPresent()){
            return optional.get();
        }
        throw new NotFoundException();
    }
}
