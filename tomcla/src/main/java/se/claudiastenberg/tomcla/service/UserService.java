package se.claudiastenberg.tomcla.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.claudiastenberg.tomcla.model.User;
import se.claudiastenberg.tomcla.repository.UserRepository;

import javax.ws.rs.NotFoundException;
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
    /*Get a UserBy IDNumber and also send a Text-Message with users name to a cellphone */
    public User getUserByIdNumber(Long idNumber){
        Optional<User> optional = repository.findByIdNumber(idNumber);

        String kundNamn = optional.get().getFirstName(); // Ska hämta namnet från databasen
        String messageToConsult = String.format("Hej, %s har kommit nu och väntar i receptionen.", kundNamn);

        if (optional.isPresent()){
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message
                    .creator(new PhoneNumber(toNumber), // to
                            new PhoneNumber("+46765196668"), // from
                            messageToConsult)
                    .create();
            return optional.get();
        }
        throw new NotFoundException();
    }
}
