package se.claudiastenberg.tomcla.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Entity
public class Consult {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String secondName;


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
