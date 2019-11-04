package com.dr.Basic;

public class IntegerTest {
    public static void main(String[] args) {
        Integer int1 = Integer.valueOf("100");
        Integer int2 = Integer.valueOf("100");
        System.out.println(int1 == int2);

        Integer int3 = Integer.valueOf("1000");
        Integer int4 = Integer.valueOf("1000");
        System.out.println(int3 == int4);

        int a = 123;
        int b = Integer.reverse(a);
        System.out.println(Integer.bitCount(123));
    }
}
