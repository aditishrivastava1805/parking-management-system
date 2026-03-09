package com.parking;

import com.parking.manager.ParkingManager;
import com.parking.model.ParkingTicket;
import com.parking.model.Vehicle;

public class Main {

    public static void main(String[] args) {

        ParkingManager manager = new ParkingManager(5);

        Vehicle v1 = new Vehicle("RJ14AB1234", "Car");
        Vehicle v2 = new Vehicle("RJ14XY7890","Car");

        ParkingTicket ticket = manager.parkVehicle(v1);
        ParkingTicket ticket2 = manager.parkVehicle(v2);

        if(ticket != null){
            ticket.printTicket();
        }

        if(ticket2 != null){
            ticket2.printTicket();
        }

        manager.leaveSlot(1);
    }
}