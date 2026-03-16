/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package docklandssmartpark;

/**
 *
 * @author huynhlehoang
 */
public interface InterfacePark {
    
    public String addSlot(String slotID);
    public String removeSlot(String slotID); 
    public String updateSlot(String oldID, String newID); 
    public String findSlot(String slotID);
    
}
