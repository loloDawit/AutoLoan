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
public class Node {
    Object data; 
    Node next; 
    
    public Node(Object data){
        this.data = data;   
    }
    
    public Node(Object data, Node next){
        this.data = data;
        this.next = next; 
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
