package com.dr.learing.polymorphism;

public class Test {
    public static void main(String[] args){
        A b = new B();
        b.printName();

        A c = new C();
        c.printName();

        IA d = new D();
        d.printName();
        IA e = new E();
        e.printName();
    }
}
