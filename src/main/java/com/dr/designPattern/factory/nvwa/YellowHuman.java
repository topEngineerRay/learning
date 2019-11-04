package com.dr.designPattern.factory.nvwa;

//黄种人
public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄种人的皮肤是黄色的");

    }

    @Override
    public void talk() {
        System.out.println("黄种人会说话，一般人说的都是双字节");

    }

}