package com.dr.learing.sort.practise;

import java.util.List;

public class leetcode {
    public static void main(String[] args) {

    }

    public List<Integer> lexicalOrder(int n) {
        String s  = Integer.toString(n);
        //拿到几位数
        int length = s.length();
        int[] returnArray = new int[length];

        for(int i=0;i<n;i++){
            int temp = 1;
            if(Integer.toString(temp).length()<length){
                returnArray[i]=temp;
                temp++;
            }
        }
        return null;
    }

}

