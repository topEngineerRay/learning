package com.dr.learing.javaBasic;

public class Methods {
    public static void main(String[] args){
        method3();
    }
    public void method1() {
        method2();
    }

    public void method2() {
        method3();
    }

    public static void method3() {
        Throwable ex = new Throwable();
        /**
         * Throwable的getStackTrace()可以返回当前线程的虚拟机栈信息，返回
         * 数组的第一个元素是栈顶元素，最后一个元素是栈底元素。
         */
        StackTraceElement[] stackElements = ex.getStackTrace();
        System.out.println(stackElements.length);
        for (StackTraceElement stackTraceElement : stackElements) {
            System.out.println(stackTraceElement.getMethodName());
        }
    }
}
