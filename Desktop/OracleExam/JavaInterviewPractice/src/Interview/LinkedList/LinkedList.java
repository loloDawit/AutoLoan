/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview.LinkedList;

/**
 *
 * @author dawitabera
 */
public class LinkedList {
    private Node head; 
    private int counter; 
    
    // Default constructor
    public LinkedList(){
        
    }
   /**
    * 
    * @param data 
    */
   public void add(Object data){
       // check if head is null
       if(head == null){
           // create a new Node and set it to head 
           head = new Node(data); 
       }
       // at this point head is not null,create new Node add put the data toit
       Node tempNode = new Node(data); 
       Node current = head; 
       
       if(current != null){
           // traverse the list 
           while (current.getNext() != null){
               current = current.getNext();
           }
           current.setNext(tempNode);
       }
       count(); 
   }
   
   public void remove(int index){
       
   }
   /**
    * 
    * @return string of data from the linked list 
    */
    @Override
   public String toString(){
       String outputString = ""; 
       
       if(head != null){
           Node current = head.getNext(); 
           while(current != null){
               outputString += " ["+ current.getData().toString() + "] ";
               current = current.getNext();
           }
       }
       return outputString; 
   }
   /**
    * 
    * @return integer 
    */
   public int count(){
       return counter++; 
   }
   /**
    * 
    * @return the size of the data in the linked list
    */
   public int size(){
       return count(); 
   }
   
}
