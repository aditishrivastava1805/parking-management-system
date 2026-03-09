package com.parking.model;

public class User {

    private String name;
    private Vehicle vehicle;

    public User(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}