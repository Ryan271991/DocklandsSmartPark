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
public class SinglyLinkedList implements LinearListInterface, Serializable {
    
    private Node head;
    private Node currNode;
    private Node prevNode;
    private int size;

    public SinglyLinkedList() {
        head = null; 
        currNode = head; 
        prevNode = null;
        size = 0;
    }
    
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }
    
    private void setCurrent (int index){
        int i;
        prevNode = null;
        currNode = head;
        for (i =1; i< index; i++){
            prevNode = currNode;
            currNode = currNode.getNext();
        }
    }
    
    @Override
    public Object get(int index) {
        setCurrent(index);
        return currNode;
    }

    @Override
    public void remove(int index) {
        if(index == 1){
            head = head.getNext();
        }else{
            setCurrent(index);
            prevNode.setNext(currNode.getNext());
        }
        size = size -1;
    }
    
    @Override
    public void add(int index, Object theElement) {
        //add the first position
        if(index == 1){
            Node n = new Node (theElement, head);
            head = n;
        }else{
            //add another position
            setCurrent(index);
            Node n = new Node (theElement, currNode);
            prevNode.setNext(n);
        }
        size = size +1;
    }

    @Override
    public void add(Object element) {
        add(size+1, element);
    }

    @Override
    public String printList() {
        String list = "";
        Node tempNode = head;
        while (tempNode != null){
            System.out.println(tempNode.getElement().toString());
            tempNode = tempNode.getNext();
        }
        return list;
    }
    
}
