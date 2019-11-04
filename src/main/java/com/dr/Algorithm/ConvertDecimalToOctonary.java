package com.dr.Algorithm;

public class ConvertDecimalToOctonary {

    public static void main(String[] args){
        System.out.println(convert(8));
        System.out.println(convert(2147483647));
    }

    private static String convert(int i){
        StringBuilder stringBuilder =new StringBuilder();
        int temp;
        while(i>0){
            temp = i%8;//8%2 = 0
            i = i/8;//8/2 = 4
            stringBuilder.insert(0,temp);
        }
        return stringBuilder.toString();
    }

}
