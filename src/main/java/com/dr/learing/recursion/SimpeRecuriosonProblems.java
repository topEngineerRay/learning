package com.dr.learing.recursion;

public class SimpeRecuriosonProblems {
    public static void main(String[] args){
        System.out.println(multipliedN(9));
        System.out.println(addN(9));
    }
    private static int addN(int n){
        //return n+addN(n-1);或者return addN(n);都是一样的错误-stack overflow,因此要写一个stackoverflow的方法，最简单就是自己调用自己，并且没有任何终结条件。

        if(n>0){
            return n+addN(n-1);
        }else{
            return 0;
        }
    }

    //使用Java代码求N的阶乘
    private static int multipliedN(int n){
        if(n>1){
            return n*multipliedN(n-1);
        }else{
            return 1;
        }
    }
}
