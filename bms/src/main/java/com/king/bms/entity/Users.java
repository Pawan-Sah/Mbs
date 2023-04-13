package com.king.bms.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name = "first_name",nullable = false,length = 20)
    private String firstName;

    @Column(nullable = false)
    private String lastname;

    //@Column(length = 20,nullable = false,unique = true)

    private String username;
    @Column(nullable = false,length = 20)
    private String password;

    @Column(nullable = false)
    private LocalDateTime dateOfBirth;

    @Column(nullable = false,unique = true,name = "mobile_no")
    private Set<Integer> phoneNumber;

    @OneToMany(mappedBy = "users")
    private List<Booking> bookings;


    public Users() {
    }

    public Users(int userId, String firstName, String lastname, String username, String password, LocalDateTime dateOfBirth, Set<Integer> phoneNumber) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Set<Integer> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Set<Integer> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
