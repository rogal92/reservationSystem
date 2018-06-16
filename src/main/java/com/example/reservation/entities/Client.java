package com.example.reservation.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue
    @NonNull
    @Column(name = "id_client")
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_address")
    private Address address;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone_number")
    private int phoneNumber;

    @Column(name = "email")
    private String eMail;

    @NonNull
    public long getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
