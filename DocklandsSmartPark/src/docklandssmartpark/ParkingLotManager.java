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
public class ParkingLotManager implements InterfacePark, InterfaceReport, Serializable{
    
    private SinglyLinkedList slotList;
    private MyQueue waitingQueue;
    private MyStack historyStack;
    String vehicleID, ownerName, status;
    
    public ParkingLotManager(){
        slotList = new SinglyLinkedList ();
        waitingQueue = new MyQueue ();
        historyStack = new MyStack ();
    }
    
    public SinglyLinkedList getSlotList() {
        return slotList;
    }

    public void setSlotList(SinglyLinkedList slotList) {
        this.slotList = slotList;
    }

    public MyQueue getWaitingQueue() {
        return waitingQueue;
    }

    public void setWaitingQueue(MyQueue waitingQueue) {
        this.waitingQueue = waitingQueue;
    }

    public MyStack getHistoryStack() {
        return historyStack;
    }

    public void setHistoryStack(MyStack historyStack) {
        this.historyStack = historyStack;
    }
    
    @Override
    public String addSlot(String slotID) {
        //create a new slot
        ParkingSlot newSlot = new ParkingSlot(slotID);
        // add on SLL
        slotList.add(newSlot);
        // push on the Stack
        historyStack.push("Added slot: " + slotID);
        return "Added parking slot " + slotID + " successfully";
    }

    @Override
    public String removeSlot(String slotID) {
        for (int i = 1; i <= slotList.size(); i++) {
            ParkingSlot p = (ParkingSlot) slotList.get(i);
            if (p.getSlotID().equalsIgnoreCase(slotID)) {
                slotList.remove(i);
                historyStack.push("Deleted Slot: " + slotID);
                return "Slot " + slotID + " has been deleted";
            }
        }
        return "Slot " + slotID + " doesn't exist";
    }

    @Override
    public String updateSlot(String oldID, String newID) {
        for (int i = 1; i <= slotList.size(); i++) {
            ParkingSlot p = (ParkingSlot) slotList.get(i);
            if (p.getSlotID().equalsIgnoreCase(oldID)) {
                p.setSlotID(newID.trim());
                historyStack.push("Updated Slot: " + oldID + " to " + newID);
                return "Slot " + oldID + " updated to " + newID;
            }
        }
        return "Slot " + oldID + " not found";
    }

    @Override
    public String findSlot(String slotID) {
        for (int i = 1; i <= slotList.size(); i++) {
            ParkingSlot p = (ParkingSlot) slotList.get(i);
            if (p.getSlotID().equalsIgnoreCase(slotID)) {
                if(p.isOccupied()==true){
                    status = "Occupied";
                }else{
                    status = "Available";
                }
                return "Slot ID: " + slotID + ", status: " + status;
            }
        }
        return "Slot " + slotID + " not found";
    }

    @Override
    public String getHistory() {
        return historyStack.displayStack();
    }

    @Override
    public String getOccupiedCount() {
        int count = 0;
        for (int i = 1; i <= slotList.size(); i++) {
            ParkingSlot p = (ParkingSlot) slotList.get(i);
            if (p.isOccupied()){
                count++;
            }
        }
        return "Total slot: " + slotList.size()+ ", occupied: " + count;
    }
    
    public String addToQueue(Vehicle v){
        waitingQueue.enqueue(v);
        historyStack.push("Queue: " + v.getVehicleID() + " joined the waiting list");
        return "Vehicle " + v.getVehicleID() + " is in the queue";
    }
    
    public String processQueue(){
        if (waitingQueue.isEmpty()){
            return "Queue is empty";
        }
        // use loop for
        for (int i = 1; i <= slotList.size(); i++) {
            ParkingSlot p = (ParkingSlot) slotList.get(i);
            if (p.isOccupied() == false) {
                Vehicle v = (Vehicle) waitingQueue.dequeue();
                p.setVehicle(v);
                historyStack.push("The vehicle: " + v.getVehicleID() + " processed " + p.getSlotID());
                return "Processed: " + v.getVehicleID() + " moved to Slot " + p.getSlotID();
            }
        }
        return "No empty slots";
    }

}
