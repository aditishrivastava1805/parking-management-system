package com.parking.model;

public class ParkingSlot {

    private int slotId;
    private boolean occupied;

    public ParkingSlot(int slotId) {
        this.slotId = slotId;
        this.occupied = false;
    }

    public int getSlotId() {
        return slotId;
    }

    public boolean isAvailable() {
        return !occupied;
    }

    public void park() {
        occupied = true;
    }

    public void leave() {
        occupied = false;
    }
}