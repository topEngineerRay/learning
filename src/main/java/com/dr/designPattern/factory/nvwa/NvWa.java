package com.dr.designPattern.factory.nvwa;

import com.dr.designPattern.factory.nvwa.factory.AbstractHumanFactory;
import com.dr.designPattern.factory.nvwa.factory.HumanFactory;

public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory YinYanglu = new HumanFactory();
        System.out.println("--造出的第一批人是白色人种");
        Human whiteHuman = YinYanglu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("--造出的第二批人是黑色人种");
        Human blackHuman = YinYanglu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("--造出的第一批人是黄色人种");
        Human yellowHuman = YinYanglu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
