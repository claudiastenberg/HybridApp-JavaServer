package se.claudiastenberg.tomcla.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Consult {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String secondName;
    @OneToMany(mappedBy = "consults", fetch = FetchType.EAGER)
    @JsonManagedReference
    private Collection<Appointment> appointment;

    protected Consult(){}

    public Consult(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Collection<Appointment> getAppointment() {
        return appointment;
    }
}
