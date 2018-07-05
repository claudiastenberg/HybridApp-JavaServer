package se.claudiastenberg.tomcla.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Consult {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String secondName;
    //private Appoinment;

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
}
