package com.dr.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        String s ="123";
        //System.out.println(s.charAt(1));
        System.out.println(selfDividingNumbers(1,22));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList();
        for(int i=left;i<=right;i++){
            //3 -> "3"
            String currentNumber = String.valueOf(i);

            int ifDevidedCount =0;

            for(int j=0;j<currentNumber.length();j++){
                //  int devidedNumber = currentNumber.charAt(j);// can not use this charAt
                String result = String.valueOf(currentNumber.charAt(j));
                int devidedNumber = Integer.parseInt(result);
                if(devidedNumber!=0) {
                    if (i % devidedNumber == 0) {
                        ifDevidedCount++;
                    }
                }
            }
            if(ifDevidedCount==currentNumber.length()){
                list.add(i);
            }
        }
        return list;
    }
}
