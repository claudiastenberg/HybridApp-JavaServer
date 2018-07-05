package se.claudiastenberg.tomcla.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Table in the database with User.
 */

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String secondName;
    private Long idNumber;
    private String company;

    protected User (){}

    public User(String firstName, String secondName, Long idNumber, String company) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.idNumber = idNumber;
        this.company = company;
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
}
