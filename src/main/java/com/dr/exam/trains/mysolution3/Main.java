package com.dr.exam.trains.mysolution3;
/**
 *  Compilation:  javac Main.java
 *  Execution:    java Main "AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7"
 *
 * @author MM <mushfiqazeri@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        //parser(args);
        //String s ="AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7";
        TrainPathGraph g = new TrainPathGraph(5);

        g.addTown("A");
        g.addTown("B");
        g.addTown("C");
        g.addTown("D");
        g.addTown("E");
        g.addRoute("A","B",5);
        g.addRoute("B","C",4);
        g.addRoute("C","D",8);
        g.addRoute("D","C",8);
        g.addRoute("D","E",6);
        g.addRoute("A","D",5);
        g.addRoute("C","E",2);
        g.addRoute("E","B",3);
        g.addRoute("A","E",7);


     /*   System.out.println("Output #1: " + g.displayDistance("ABC"));
        System.out.println("Output #2: " + g.displayDistance("AD"));
        System.out.println("Output #3: " + g.displayDistance("ADC"));
        System.out.println("Output #4: " + g.displayDistance("AEBCD"));
        System.out.println("Output #5: " + g.displayDistance("AED"));
        System.out.println("Output #6: " + g.calculateTripsCountLess("C", "C", 3));
        System.out.println("Output #7: " + g.calculateTripsCountExact("A", "C", 4));
        System.out.println("Output #8: " + g.calculateShortestPath("A", "C"));
        System.out.println("Output #9: " + g.calculateShortestPath("B", "B"));
        System.out.println("Output #10: " + g.calculateRoutesCount("C", "C", 30));*/
    }

}