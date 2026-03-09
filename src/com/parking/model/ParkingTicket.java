package com.parking.model;

public class ParkingTicket {

    private int slotId;
    private String vehicleNumber;

    public ParkingTicket(int slotId, String vehicleNumber) {
        this.slotId = slotId;
        this.vehicleNumber = vehicleNumber;
    }

    public void printTicket() {

        System.out.println("----- Parking Ticket -----");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Slot Number: " + slotId);
        System.out.println("--------------------------");
    }
}