/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package docklandssmartpark;

/**
 *
 * @author huynhlehoang
 */
public interface StackInterface {
    
    public void push(Object e);
    public boolean isFull();
    public Object pop();
    public Object peek();
    public boolean isEmpty();
    public int size();
    public String displayStack();
    
}
