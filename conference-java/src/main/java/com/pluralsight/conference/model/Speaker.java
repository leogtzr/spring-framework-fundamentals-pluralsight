package com.pluralsight.conference.model;

import org.springframework.beans.factory.annotation.Value;

public class Speaker {

    private String firstName;
    private String lastName;
    private double seedNum;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", seedNum=" + seedNum +
                '}';
    }

    public double getSeedNum() {
        return seedNum;
    }

    public void setSeedNum(final double seedNum) {
        this.seedNum = seedNum;
    }
}
