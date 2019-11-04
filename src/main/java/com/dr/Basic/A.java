package com.dr.Basic;

public class A {
    private String str = "1";
    private String str2 = "1";
    private  String string1 = "123";

    Integer a = 1;
    Integer b = 1;
    private static final String name = "tom";

    public void aMethod() {
        A.bMethod();
        string1 = "2";
    }

    public static void bMethod() {

    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.str == a.str2);
        System.out.println(a.a == a.b);
    }

    static class B {
        private String str = "1";
        private static final String name = "tom";

        public void aMethod() {
            A a = new A();
            a.aMethod();
        }

        public static void bMethod() {
            A.bMethod();

        }

    }
}