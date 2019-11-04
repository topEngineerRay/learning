package com.dr.Basic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Autoboxing{
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4);
        int sum = 0;
        for(int i:list){
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void main1(String[] args){
        List list = Arrays.asList(new Integer[]{
                Integer.valueOf(1),
                Integer.valueOf(2),
                Integer.valueOf(3),
                Integer.valueOf(4)});

        int sum = 0;
        for(Iterator locaIterator = list.iterator();locaIterator.hasNext();){
            int i = ((Integer)locaIterator.next()).intValue();
            sum += i;
        }
        System.out.println(sum);
    }
}
