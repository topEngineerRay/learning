package com.dr.learing.javaBasic;

public class OO{

    private final static class A{
        int a ;
        public void m2(){

        }
    }

    public static void m1(){
            //m2();
        A a = new A();
        a.m2();
        m3();
    }
    public void m2(){

    }

    public static void m3(){

    }
}

//final类不能继承
 final  class A{
    int a ;
}
