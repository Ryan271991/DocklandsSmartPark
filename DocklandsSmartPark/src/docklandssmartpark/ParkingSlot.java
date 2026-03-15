/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandssmartpark;

/**
 *
 * @author huynhlehoang
 */
public class ParkingSlot implements java.io.Serializable{
    
    private String slotID;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSlot(String slotID) {
        this.slotID = slotID;
        this.isOccupied = false; //default is empty
        this.vehicle = null;
    }

    public String getSlotID() {
        return slotID;
    }

    public void setSlotID(String slotID) {
        this.slotID = slotID;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = (vehicle != null);
    }

    @Override
    public String toString() {
        return "ParkingSlot: " + "slotID=" + slotID + ", isOccupied=" + isOccupied + ", vehicle=" + vehicle;
    }
    
}
