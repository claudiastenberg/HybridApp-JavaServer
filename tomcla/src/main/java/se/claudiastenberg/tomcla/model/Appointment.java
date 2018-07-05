package se.claudiastenberg.tomcla.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Appointment {

    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private User user;
    private Consult consult;

    protected Appointment(){}

    public Appointment(String description, User user, Consult consult) {
        this.description = description;
        this.user = user;
        this.consult = consult;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    public Consult getConsult() {
        return consult;
    }
}
