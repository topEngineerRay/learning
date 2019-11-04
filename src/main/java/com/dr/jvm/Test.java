package com.dr.jvm;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        Long s = Runtime.getRuntime().maxMemory();
        System.out.println(s);
        //heapOOM();
    }

    private static void heapOOM(){
            List<Object> list = new ArrayList<>();
            while(true){
                list.add(new byte[2 * 1024]);
            }
    }

}
