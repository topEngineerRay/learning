package com.dr.Algorithm;
import java.util.*;

public class GetAllSubCollection {
    //{1，2，3}  -> {},{1},{2},{3},{1,2},{1,3},{1,2,3}
    //{1，2，3}  -> {},{1},{2},{3},{1,2},{1,3},{1,2,3}
    public static void main(String[] args){
        int[] array = {1,2,3};
        List SubCollection = getAllSubCollection(array);
       //SubCollection = getAllSubCollection(array);
        for(Object set : SubCollection){
            System.out.println(set.toString());
        }
    }
    private static List getAllSubCollection(int[] array){
        int[] emptyArray = {};
        int[] fullArray =array;
        List list  = new LinkedList();
        //empty list,eg:{}
        if(array.length==0){
            list.add(emptyArray);
        }else{
            //add
            list.add(emptyArray);
            list.add(fullArray);
            for(int i=0;i<=array.length-1;i++){
                list.add(array[i]);
                for(int j=i+1;j<=array.length-1;j++){
                    //check if the element is the same
                    if(array[i]!=array[j]){
                        int[] tempArray = {array[i],array[j]};
                        list.add(tempArray);
                    }
                }
            }
        }
        return list;
    }
}
