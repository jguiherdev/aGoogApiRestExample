package com.codingjava.codingjava.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class Userr {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRST_NAME", nullable = false, length = 50)
    @Size(min = 1, message = "{validation.name.size.too_short}")
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false, length = 50)
    @Size(min = 1, message = "{validation.name.size.too_short}")
    private String lastName;

    @Column(name = "PHONE_NUMBER", nullable = false, length = 9)
    @Size(min = 1, message = "{validation.name.size.too_short}")
    private String phoneNumber;

    @Column(name = "EMAIL", nullable = false, length = 50)
    @Size(min = 1, message = "{validation.name.size.too_short}")
    private String email;

    public Userr(Long id, String firstName, String lastName, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Userr() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
