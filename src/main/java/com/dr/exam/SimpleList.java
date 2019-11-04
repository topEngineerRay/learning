package com.dr.exam;

public class SimpleList {
    //头节点
    private Node head;

    //private Node tail;

    private int length = 0;

    public SimpleList(){
        this.head = null;
    }

    public SimpleList(Object value){
        this.head = new Node(value);
        length++;
    }

    public void insert(Object value){

        Node newNode = new Node(value);
        Node currentTail = getTail();
        currentTail.next = newNode;

        length++;//单链表长度加1
    }


    public void insertAt(int index, Object value){
        Node node = new Node(value);
        if(head==null&&index==0){
            head = node ;
            return;
        }
        if(head==null&&index!=0){
            System.out.println("empty list");
            throw new RuntimeException("empty list");
        }

        Node temp = head;
        if(head!=null){
            int i = 1;
            while (temp.next!=null){
                if(i==index){
                    Node currentNext = temp.next;
                    temp.next=node;
                    node.next = currentNext;
                    return ;
                }

                temp = temp.next;
                i++;
            }
        }

        length++;
    }

    //拿尾节点元素
    public Node getTail(){

        Node temp = head;

        if(head==null){
            return null;
        }else {
            //为了不改变头节点
            while (temp.next != null) {
                temp = temp.next;
            }
        }
        return temp;
    }

    public Node getHead(){
        return head;
    }

    public boolean isListEmpty(){

        return head==null;
    }

    public int getSize(){
        return length;
    }

    public void removeLast(){

        Node temp = head;

        if(head==null){
            return;
        }else {
            //为了不改变头节点
            while (temp.next != null) {
                temp = temp.next;
            }
            temp = null;
        }
    }
}
//链表节点定义
class Node{
    Object value;
    Node next;
    public Node(Object value){
        this.value = value;
    }
}

