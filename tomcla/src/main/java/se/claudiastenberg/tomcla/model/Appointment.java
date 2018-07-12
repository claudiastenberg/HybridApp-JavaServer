package se.claudiastenberg.tomcla.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Entity
public class Appointment {

    @Id
    @GeneratedValue
    private Long id;
    private String description;
    /*@ManyToOne
    @JsonBackReference
    private User user;*/
    @OneToMany(mappedBy = "appointment", fetch = FetchType.EAGER)
    @JsonManagedReference
    private Collection<User> user;

    //private User user;
    //private Consult consult;

    protected Appointment(){}

    public Appointment(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Collection<User> getUser() {
        return user;
    }
}
