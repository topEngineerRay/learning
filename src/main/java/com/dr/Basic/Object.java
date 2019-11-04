package com.dr.Basic;

public class Object {
    int i;
    Object o;
    A a;
    class A{

    }
    public static void main(String[] args){
        Object a = new Object();
        Object b = a;
        Object c = a;
        System.out.println(b==c);
        Object o;
        //System.out.println(i);
        a.a();
    }
    private void a(){
        int j;
        System.out.println(i);
        A a;
    }
}
