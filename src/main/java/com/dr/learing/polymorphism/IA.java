package com.dr.learing.polymorphism;

public interface IA {
    //接口的方法定义必须是public的，默认也是public的，这是接口的一个规范，
    // 而重写一个方法时，不能降低可见性
    public void printName();
}
