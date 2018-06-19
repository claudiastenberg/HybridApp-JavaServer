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
    private String userName;
    private String password;

    protected User (){}

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
