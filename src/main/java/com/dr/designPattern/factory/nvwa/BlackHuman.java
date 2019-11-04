package com.dr.designPattern.factory.nvwa;

//黑种人
public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑种人的皮肤是黑色的");

    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人都听不懂");
    }

}