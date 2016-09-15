package com.example.daniel.bikerapp;

/**
 * Created by MiguelPC on 24/08/2016.
 */
public class User {
    private String email;
    private String password;
    private String registrationDate;

    public User(String email, String password, String registrationDate) {
        this.email = email;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return email;
    }
}
