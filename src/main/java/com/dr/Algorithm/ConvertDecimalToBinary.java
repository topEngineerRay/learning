package com.dr.Algorithm;

public class ConvertDecimalToBinary {

    public static void main(String[] args){
        System.out.println(convert(7));
        System.out.println(convert(2147483647));
    }

    private static String convert(int i){
        StringBuilder stringBuilder =new StringBuilder();
        int temp;
        while(i>0){
            temp = i%2;//8%2 = 0
            i = i/2;//8/2 = 4;
            stringBuilder.insert(0,temp);
            //.append(temp);
        }
        return stringBuilder.toString();
    }
}
