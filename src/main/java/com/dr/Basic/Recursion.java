package com.dr.Basic;

public class Recursion {
    public static int digui(int n){
        if(n==1||n==0){
            return n;
        }else{
            System.out.println("执行第" + n + "次");
            return n*digui(n-1);
            //一个一个的返回
        }
    }
    public static void main (String[] args) {
        System.out.print(digui(5));
    }
}
