package se.claudiastenberg.tomcla.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Collection;

/**
 * Table in the database with User.
 */
/**/
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String secondName;
    private Long idNumber;
    private String company;
    @ManyToOne
    @JsonBackReference
    private Appointment appointment;
    /*
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    @JsonManagedReference
    private Collection<Appointment> appointmentCollection;*/

    protected User (){}

    public User(String firstName, String secondName, Long idNumber, String company, Appointment appointment) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.idNumber = idNumber;
        this.company = company;
        this.appointment =appointment;
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

    public Long getIdNumber() {
        return idNumber;
    }

    public String getCompany() {
        return company;
    }

    public Appointment getAppointment() {
        return appointment;
    }
}
