package com.mycompany.picnicdestination.models;

// Create a class called Student

import java.util.Date;

public class Ticket {
    // Declaration of global variables
    private String UsernameT;
    private String PicnicName;
    private String Location;
    private double Price;
    private Date Date;

    public Ticket(String UsernameT, String PicnicName, String Location, double Price, Date Date) {
        this.UsernameT = UsernameT;
        this.PicnicName = PicnicName;
        this.Location = Location;
        this.Price = Price;
        this.Date = Date;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }


    public String getUsernameT() {
        return UsernameT;
    }

    public void setUsernameT(String UsernameT) {
        this.UsernameT = UsernameT;
    }

    public String getPicnicName() {
        return PicnicName;
    }

    public void setPicnicName(String PicnicName) {
        this.PicnicName = PicnicName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
}
