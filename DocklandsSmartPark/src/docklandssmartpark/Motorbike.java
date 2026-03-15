/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandssmartpark;

/**
 *
 * @author huynhlehoang
 */
public class Motorbike extends Vehicle {
    private int engineSize;

    public Motorbike(int engineSize, String vehicleID, String ownerName) {
        super(vehicleID, ownerName);
        this.engineSize = engineSize;
    }

    @Override
    public String getParkingCategory() {
        if(this.engineSize >= 175){
            return "Big Motorbike Parking";
        }
        return "Motorbike parking";
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return super.toString() + ", Engine: " + engineSize + "cc";
    }
    
}
