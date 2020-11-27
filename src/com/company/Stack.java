package com.company;

public class Stack {
    Node head ;
    public void push(int value){
        Node n = new Node(value) ;
        if (head == null){
            n.next = null ;
            head = n ;
        }else {
            n.next = head ;
            head = n ;
        }
    }

    public int pop(){
        Node temp ;
        int result ;
        if (head == null){
            return 0 ;
        }else {
           result = head.getData() ;
           temp = head ;
           head = head.next ;
        }
        return result ;
    }
}
