package com.staid.applications.carlogger;

import java.time.LocalDate;
import java.util.Date;

public class Driver {

    String firstName;
    String lastName;
    String nickName;
    String licenceExpiry;

    public Driver(){}

    public Driver(String firstName, String lastName, String nickName, String licenceExpiry) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.licenceExpiry = licenceExpiry;
    }

    public Driver(String firstName, String lastName, String nickName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLicenceExpiry() {
        return licenceExpiry;
    }

    public void setLicenceExpiry(String licenceExpiry) {
        this.licenceExpiry = licenceExpiry;
    }
}
