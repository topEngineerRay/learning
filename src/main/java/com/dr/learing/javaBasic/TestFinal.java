package com.dr.learing.javaBasic;

public class TestFinal {
    public static void main(String[] args) {
        final int i = 0;
        //i =9;
        final String s = "1";
        //s ="9";

        //这里的final是修饰的a这个引用
        final int[] a = new int[10];
        a[0] = 1;
        //以上两种写法，在虚拟机的内存中分配是不一样的
        B b = new B();
        b.aa();
    }

    private static class A {
        private final void a() {
            System.out.println("aaa");
        }

        private void aa() {
            System.out.println("aaa");
        }

        public final void aaa() {
            System.out.println("aaa");
        }

        public void aaaa() {
            System.out.println("aaaa");
        }

        protected void aaaaa() {
            System.out.println("aaaa");
        }
    }

    private static class B extends A {

        //@Override
        private final void a() {
            System.out.println("b");
        }

        //@Override
        private void aa() {
            System.out.println("bbb");
        }

        /*public final void aaa() {
            System.out.println("aaa");
        }*/

        @Override
        public void aaaa() {
            System.out.println("bbbb");
        }

        @Override
        public void aaaaa() {
            System.out.println("bbbbb");
        }
    }
}
