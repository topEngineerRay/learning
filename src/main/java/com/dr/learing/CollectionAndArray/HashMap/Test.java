package com.dr.learing.CollectionAndArray.HashMap;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*
        Node node = new Node(1, 2, 3, null);
        //System.out.println(node.next.value);
        Node node1 = new Node(1, 2, 3, null);
        node.next = node1;
        System.out.println(node.next.value);

        String key = "1";
        hash(key);
        */
        getFromCircleNodeList(4,4);
    }

    static final int hash(Object key) {
        int h;
        h = key.hashCode();
        int h1 = h>>>16;
        int h2 = h ^ h1;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
    private static Node getFromCircleNodeList(int hash, Object key){
        Node node1 = new Node(1,1,1,null);
        Node node2 = new Node(2,2,2,null);
        Node node3 = new Node(3,3,3,null);
        node1.next=node2;
        node2.next=node3;
        node3.next=node1;
        if(node1.hash==hash&&node1.key.equals(key)){
            System.out.println("111");
        }
        Node e = node1;
        do {
            if ((e.hash == hash) && (e.key.equals(key)))
                System.out.println("111");
                return e;
        } while ((e = node1.next) != null);
    }
}
