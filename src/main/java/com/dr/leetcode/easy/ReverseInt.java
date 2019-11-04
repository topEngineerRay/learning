package com.dr.leetcode.easy;


public class ReverseInt {
    /*
    Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only hold integers within
the 32-bit signed integer range. For the purpose of this problem,
assume that your function returns 0 when the reversed integer overflows.
 */

    public static void main(String[] args){
        reverse(964632);
        System.out.println(reverse1(12345));
    }
    public static int reverse(int x) {
        try{
            String s = String.valueOf(x);
            StringBuffer sb = new StringBuffer();
            char[] chars = s.toCharArray();
            //for(int i=chars.length;i>0;i--){
            //remember the index is from 0 to size-1
            for(int i=chars.length-1;i>=0;i--){
                sb.append(chars[i]);
            }
            if(sb.toString().endsWith("-")){
                sb.insert(0,"-");
                return Integer.parseInt(sb.substring(0,sb.length()-1).toString());
            }
            return Integer.parseInt(sb.toString());
        }catch(NumberFormatException e){
            return 0;
        }
    }
    public static int reverse1(int x) {
        if(x == Integer.MIN_VALUE){
            return 0;
        }
        int num = Math.abs(x);//取绝对值
        int res = 0;
        while(num!=0)
        {
            //越界判断
            if(res>(Integer.MAX_VALUE-num%10)/10)
                return 0;
            res = res*10+num%10;
            num /= 10;
        }
        return x>0?res:-res;//返回时根据是否为负数决定是否加负号
    }
    public static int reverse2(int x){
        if(x == 0){
            return 0;
        }
        int num = Math.abs(x);

        return x>0?num:-num;
    }
}
