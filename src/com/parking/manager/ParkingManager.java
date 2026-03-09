package com.parking.manager;

import com.parking.model.ParkingSlot;
import com.parking.model.ParkingTicket;
import com.parking.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    private List<ParkingSlot> slots;

    public ParkingManager(int totalSlots) {

        slots = new ArrayList<>();

        for(int i = 1; i <= totalSlots; i++) {
            slots.add(new ParkingSlot(i));
        }
    }

    public ParkingTicket parkVehicle(Vehicle vehicle) {

        for(ParkingSlot slot : slots) {

            if(slot.isAvailable()) {

                slot.park();

                System.out.println("Vehicle parked at slot: " + slot.getSlotId());

                return new ParkingTicket(slot.getSlotId(), vehicle.getVehicleNumber());
            }
        }

        System.out.println("Parking Full");
        return null;
    }

    public void leaveSlot(int slotId) {

        for(ParkingSlot slot : slots) {

            if(slot.getSlotId() == slotId) {

                slot.leave();

                System.out.println("Slot " + slotId + " is now free");
                return;
            }
        }
    }
}