/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package docklandssmartpark;

/**
 *
 * @author huynhlehoang
 */
public class DocklandsSmartPark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // Initialize data structures
        MyStack history = new MyStack();
        MyQueue waitingQueue = new MyQueue();
        SinglyLinkedList slotList = new SinglyLinkedList();
        
        //add slots
        slotList.add(new ParkingSlot("1"));
        slotList.add(new ParkingSlot("2"));
        System.out.println("slot list size: " + slotList.size());
  
        //create the samples vehicle
        Vehicle v1 = new Car(5, "1", "Hoang");
        Vehicle v2 = new ElectricCar(85, "2", "Ryan");
        Vehicle v3 = new Motorbike(120, "3", "Quang");
        
        //testing MyQueue
        waitingQueue.enqueue(v1);
        waitingQueue.enqueue(v2);
        waitingQueue.enqueue(v3);
        System.out.println("queue Size: " + waitingQueue.size());
        
        //testing MyStack
        history.push("Check-in: Vehicle 1, Slot 1");
        history.push("Check-in: Vehicle 2, Slot 2");
        history.push("Check-in: Vehicle 3, Slot 3");
        System.out.println("history stack: " + history.size());
        System.out.println("display history: " + history.displayStack());
        System.out.println("latest history: " + history.peek());
        
        //testing SLL & Queue
        if (waitingQueue.isEmpty()==false) {
            //take vehicle from waitingQueue
            Vehicle v = (Vehicle) waitingQueue.dequeue();

            // get slot 1
            ParkingSlot p1 = (ParkingSlot) slotList.get(1);
            
            //set vehicle, set Occupied in slot 1
            p1.setVehicle(v);
            p1.setOccupied(true);
            
            System.out.println("vehicle " + v.getVehicleID() + " to slot: " + p1.getSlotID());
            System.out.println("Added to slot list, size: " + slotList.size());
            
            ParkingSlot retrievedSlot = (ParkingSlot) slotList.get(1);
            System.out.println("retrieved from SLL: " + retrievedSlot.getSlotID());
        }
        
        //check empty stack
        if (history.isEmpty()){
            System.out.println("No more vehicles in history stack");
        } else {
            System.out.println("Vehicles remaining in stack: " + history.size());
        }
        
        DocklandsSmartParkGUI mygui = new DocklandsSmartParkGUI();
        mygui.setVisible(true);
    }
    
}
