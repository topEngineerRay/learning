package com.dr.designPattern.factory.nvwa;
//白种人
public class WhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白种人的皮肤是白色的");

    }

    @Override
    public void talk() {
        System.out.println("白种人人会说话，一般说的都是单子节");

    }

}