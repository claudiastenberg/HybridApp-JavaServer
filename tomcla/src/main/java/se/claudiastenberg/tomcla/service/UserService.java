package se.claudiastenberg.tomcla.service;

import org.springframework.stereotype.Service;
import se.claudiastenberg.tomcla.model.User;
import se.claudiastenberg.tomcla.repository.UserRepository;

/**
 * Layer that take care off all request from the web. Service handle what too do with them.
 */

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    /*Skapa en User*/
    public User createUser(User user){
        return repository.save(user);
    }
}
