/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandssmartpark;

import java.io.Serializable;

/**
 *
 * @author huynhlehoang
 */
public abstract class Vehicle implements Serializable{
    private String vehicleID;
    private String ownerName;

    public Vehicle(String vehicleID, String ownerName) {
        this.vehicleID = vehicleID;
        this.ownerName = ownerName;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    //return information of the vehicle
    public String getVehicleInfo() {
        return "Vehicle{" + "vehicleID=" + vehicleID + ", ownerName=" + ownerName + '}';
    }
    
    //Polymorphism
    public abstract String getParkingCategory();

    @Override
    public String toString() {
        return getVehicleInfo() + "Category: " +getParkingCategory();
    }
    
}
