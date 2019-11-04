package com.dr.learing.CollectionAndArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        String[] s = new String[2];
        s[0] = "1";
        /*s[1] ="2";*/
        System.out.println(s[1]);

        List list = new ArrayList<>();
        List list1 = new LinkedList();
        list.add("s");
        list.add(1);
        Object[] s1 = list.toArray();
        System.out.println(s1[0]);
        s1[0] = 1;

        System.out.println(s1[0]);

    }
}
