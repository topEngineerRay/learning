package com.dr.Algorithm;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args){
        getTheBinararyOfANumber(100198);
        getTheBinararyOfANumber(3);
        getTheBinararyOfANumber(192);
        getTheBinararyOfANumber(128);
        String s = "https://jupiter-scp.cfapps.eu10.hana.ondemand.com/api/hybris/business-partner-ui/v2/v1/customers?q=(customerNumber:*%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84*%20firstName:*%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84*%20lastName:*%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84*%20company:*%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84%E7%9A%84*)&pageSize=20&pageNumber=1";
        System.out.println(s.length());
        //int[] a = {1,2,3,4,5,6,2};
        //System.out.println(judgeArrayDupllicated(a));
    }
    //返回一个数字中二进制1的个数
    private static void getTheBinararyOfANumber(int i){
        int i1 ;
        int i2;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilderDesc = new StringBuilder();
        String s = "";
        //int[] a = Integer.parseInt(s);
        int count = 0;
        while(i>0){
            //3/2 =1
            i1=i%2;
            s += i1;
            if(i1==1){
                count++;
            }
            stringBuilder.append(i1);
            i=i/2;
        }
        System.out.println(count);
        //System.out.println(stringBuilder.toString());
    }
    //长度为n的数组，每个元素大小不超过n，用时间复杂度o(n)的算法判断是否有重复元素
    //分析，满足长度为n的数组，元素大小不超过n，没有重复的只有一种可能就是数组中的元素
    //恰好是从1到n
    private static boolean judgeArrayDupllicated(int array[] ){
        //solution 1
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    //o(n)~o(n x n)
                    return true;
                }
            }
        }
        //solution 2
        Set s = new HashSet<Integer>();
        for(int i=0;i<array.length;i++){
            s.add(array[i]);
        }
        if(s.size()!=array.length){
            return true;
        }
        //solution 3


        return false;
    }

}
