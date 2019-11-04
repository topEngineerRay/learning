package com.dr.Basic;

import java.lang.Class;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Unicycle unicycle = new Unicycle("Unicycle");
        Cycle.ride(unicycle);
        Class c1 = unicycle.getClass();
        System.out.println(c1.getName());

        Bicycle bicycle = new Bicycle("Bicycle");
        Cycle.ride(bicycle);
        Class c2 = Class.forName("com.dr.Basic.Bicycle");
        System.out.println(c2.getName());

        Tricycle tricycle = new Tricycle("Tricycle");
        Cycle.ride(tricycle);
        Class c3      = Tricycle.class;
        System.out.println(c3.getName());
    }
}

class Cycle {
    private String name;

    public Cycle(String str) {
        name = str;
    }

    public static void ride(Cycle c) {
        System.out.println(c.name + "is riding");
    }
}

class Unicycle extends Cycle {
    private String name;

    public Unicycle(String str) {
        super(str);
        name = str;
    }
}

class Bicycle extends Cycle {
    private String name;

    public Bicycle(String str) {
        super(str);
        name = str;
    }
}

class Tricycle extends Cycle {
    private String name;

    public Tricycle(String str) {
        super(str);
        name = str;
    }
}