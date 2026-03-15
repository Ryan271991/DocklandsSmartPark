/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandssmartpark;

/**
 *
 * @author huynhlehoang
 */
public class ElectricCar extends Vehicle {
    private int batteryLevel;

    public ElectricCar(int batteryLevel, String vehicleID, String ownerName) {
        super(vehicleID, ownerName);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String getParkingCategory() {
        return "Charging Parking";
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Battery: "+ batteryLevel +"%";
    }
    
}
