package com.dr.exam;

import java.math.BigInteger;
import java.util.Scanner;

class factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a number for factorial calculation");
        int n = sc.nextInt();
        System.out.println("the result is "+fn(n));
    }
    public static BigInteger fn(int n){
        BigInteger factorial_result = BigInteger.valueOf(1);
        // define a big integer to store the result
        for(int i=1; i<=n; i++){

            factorial_result = factorial_result.multiply(BigInteger.valueOf(i));

        }
        return factorial_result;
    }
}
