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
public class MyStack implements StackInterface{
    
    private ArrayList<String> theStack;
    /**
     * Creates a new instance of Stack
     */
    public MyStack() {
        theStack = new ArrayList<String>();
    }

    /**
     * puts/inserts an item onto the TOP (first position) of the stack
     */
    @Override
    public void push(Object newItem) {
        theStack.add(0, (String) newItem);
    }
    /**
     * always false as there is no limit on the size of this ArrayList based
     * stack
     */
    @Override
    public boolean isFull() {
        return false;
    }
    
    /**
     * removes the item from the TOP (first position) of the stack and returns
     * it
     */
    @Override
    public Object pop() {
        if (!(theStack.isEmpty())) {
            return theStack.remove(0);
        } else {
            return null;
        }
    }
    /*
    * View the first position without delete it.
    */
    @Override
    public Object peek() {
        if (theStack.isEmpty()) {
          System.out.println("Empty saved");
          return null;
      } else {    
          return theStack.get(0);
      }
    }

    @Override
    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    @Override
    public int size() {
        return theStack.size();
    }

    @Override
    public String displayStack() {
       //using a for loop
       String str = new String(); 
       //String str = ""; will also work and is more familiar
       if(theStack.isEmpty()){
           str = str.concat("EMPTY!");
       }else{
           for (int i = 0; i<theStack.size(); i++){
               str = str.concat(theStack.get(i).toString());
               str = str.concat(" ; ");
           }
       }
       return str;
    }
    
}
