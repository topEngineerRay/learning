package com.dr.exam;

public class Stack{
    //链式栈
    public Node head;
    public Node current;
    //define the head and current node
    public void push(int data){
        if( head == null){
            head =new Node(data);
            current = head;
        }
        //if no data, then create new head;
        else{
            Node node = new Node(data);
            node.pre =current;   // the previous one will be current data;
            current= node; // current data will be the new added one ;
        }
    }
    // push action
    public Node pop(){
        if (current == null){
            return null;
        }
        Node node = current; // the pop out data will be current data;
        current = current.pre; // the current data will be the preious one;
        return node;
    }
    class Node{
        int data;
        Node pre; // we need to know the preious one;
        public Node(int data){
            this.data= data;
        }
    }
    // define the Node class
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop().data);
        System.out.println(stack.pop().data);
        System.out.println(stack.pop().data);
    }
}
