package com.canada.mortgage.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name="user")
@DynamicUpdate
public class User {

    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_generator")
    @SequenceGenerator(name="user_id_generator", initialValue = 1, allocationSize = 1,sequenceName = "user_id_seq")
    private Long userId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="date_of_birth")
    private String dateOfBirth;

    @Column(name="email_address")
    private String emailAddress;

    @Column(name="password")
    private String password;

    @Column(name="address")
    private String address;

    @Column(name="cell_phone_number")
    private String cellPhoneNumber;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long user_id) {
        this.userId = user_id;
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

    public void setLasttName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public User(String fname, String lname, String dateOfBirth, String emailAddress, String password, String address, String cellPhoneNumber) {
        this.firstName = fname;
        this.lastName = lname;
        this.emailAddress = emailAddress;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.address = address;
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public User() {
    }

    @Override
    public String toString() {

        return "User [id=" + userId
                + ", fname=" + firstName
                + ", lname=" + lastName + "]"
                + ", dateOfBirth=" + dateOfBirth + "]"
                + ", emailAddress=" + emailAddress + "]"
                + ", password=" + password + "]"
                + ", cellPhoneNumber=" + cellPhoneNumber + "]"
                + ", address=" + address + "]"

                ;
    }

}
