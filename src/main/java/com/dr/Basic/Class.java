package com.dr.Basic;

public class Class {
    public static void main(String[] args){
         Class class1 = new Class();
        Object a = new Object();
        //Class.class ;
        class1.getClass().getClass().getClass().getClass();
    }

    private static native void registerNatives();

    static {
        registerNatives();
    }

}
