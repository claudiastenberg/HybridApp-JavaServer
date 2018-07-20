package se.claudiastenberg.tomcla.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.Collection;

@Entity
public class Appointment {

    @Id
    @GeneratedValue
    private Long id;
    private String description;
    @OneToMany(mappedBy = "appointment", fetch = FetchType.EAGER)
    @JsonManagedReference
    private Collection<User> user;
    @ManyToOne
    @JsonBackReference
    private Consult consults;

    protected Appointment(){}

    public Appointment(String description, Consult consults) {
        this.description = description;
        this.consults= consults;
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

    public Consult getConsults() {
        return consults;
    }
}
