/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package docklandssmartpark;

/**
 *
 * @author huynhlehoang
 */
public interface LinearListInterface {
    
    public Object get(int index);
    public void remove(int index);
    public void add(int index, Object theElement);
    public void add(Object element);
    public String printList();
    public boolean isEmpty();
    public int size();
    
}
