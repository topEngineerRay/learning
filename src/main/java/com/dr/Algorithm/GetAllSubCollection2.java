package com.dr.Algorithm;

import java.util.*;

public class GetAllSubCollection2 {
    static Set<Set<Integer>> getSubsets2(ArrayList<Integer> set){
        //Use set to filter duplicated
        Set<Set<Integer>> allsubsets = new HashSet<Set<Integer>>();
        int max = 1 << set.size(); //how many sub sets //0001 -> 0100
        for(int i=0; i<max; i++){
            int index = 0;
            int k = i;
            //use set here to filter duplicated number
            Set<Integer> s = new HashSet<>();
            while(k > 0){
                if((k&1) > 0){
                    s.add(set.get(index));
                }
                k>>=1;
                index++;
            }
            allsubsets.add(s);
        }
        return allsubsets;
    }

    public static void main(String[] args){
        ArrayList<Integer> s = new ArrayList<Integer>();
        s.add(1);
        s.add(2);
        s.add(3);
        /*s.add(4);
        s.add(1);*/
        Set<Set<Integer>> allsubsets = getSubsets2(s);
        for(Set<Integer> set : allsubsets){
            System.out.println(set);
        }
    }
}
