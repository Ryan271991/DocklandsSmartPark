/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandssmartpark;

import java.util.ArrayList;

/**
 *
 * @author huynhlehoang
 */
public class MyQueue implements QueueInterface{
   
    // use ArrayList to stored the Vehicle objects
    private ArrayList<Vehicle> theQueue;

    // declare a new queue
    public MyQueue() {
        theQueue = new ArrayList<Vehicle>();
    }
    
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    public int size() {
        return theQueue.size();
    }
    
    /*
    * Return the vehicle at the front of the queue without retrieving it (FIFO)
    */
    public Object frontElement() {
        if (theQueue.size() > 0) {
            return theQueue.get(0);
        } else {
            return null;
        }
    }
    
    /*
    * Add a vehicle to the end of the queue
    */
    public void enqueue(Object element) {
        //Cast the Object type to Vehicle type to save it to the waiting list of vehicles
        theQueue.add((Vehicle) element);
    }
    
    /*
    * Take the car at the front of the queue to allow it into the parking space.
    * Take the element at index 0 (FIFO).
    */
    public Object dequeue() {
        if (theQueue.size() > 0) {
            return theQueue.remove(0);
        } else {
            return null;
        }
    }
    
    public String displayQueue() {
       //using a for loop
       String str = new String(); 
       //String str = ""; will also work and is more familiar
       if(theQueue.isEmpty()){
           str = str.concat("EMPTY!");
       }else{
           for (int i = 0; i<theQueue.size(); i++){
               str = str.concat(theQueue.get(i).toString());
               str = str.concat(" ; ");
           }
       }
       return str;
    }
    
}
