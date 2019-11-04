package com.dr.learning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ForEach {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("1");
        set.add("2");
        for (String s : set) {
            System.out.println(s);
        }
        for (Iterator it = set.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}
