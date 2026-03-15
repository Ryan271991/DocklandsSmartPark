/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandssmartpark;

/**
 *
 * @author huynhlehoang
 */
public class Car extends Vehicle implements java.io.Serializable{
    private int numSeats;

    public Car(int numSeats, String vehicleID, String ownerName) {
        super(vehicleID, ownerName);
        this.numSeats = numSeats;
    } 

    @Override
    public String getParkingCategory() {
        return "Standard Parking";
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public String toString() {
        return super.toString() + ", Seats "+numSeats; 
    }
    
}
