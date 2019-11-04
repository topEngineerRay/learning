package com.dr.learing.CollectionAndArray;

public class tes1 {
    private static tes1 ourInstance = new tes1();

    public static tes1 getInstance() {
        return ourInstance;
    }

    static int a = 1;
    int b = 2;

    private void tes1() {
        //a =ourInstance;
        a = b;
        a = 2;
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");

    }
}
