package com.dr.exam.trains.mysolution3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

public class TrainPathGraphTest {

    TrainPathGraph trainPathGraph;
    @Before
    public void prepareGraphData(){
        trainPathGraph = new TrainPathGraph(5);

        trainPathGraph.addTown("A");
        trainPathGraph.addTown("B");
        trainPathGraph.addTown("D");
        trainPathGraph.addTown("C");
        trainPathGraph.addTown("E");
        trainPathGraph.addRoute("A","B",5);
        trainPathGraph.addRoute("B","C",4);
        trainPathGraph.addRoute("C","D",8);
        trainPathGraph.addRoute("D","C",8);
        trainPathGraph.addRoute("D","E",6);
        trainPathGraph.addRoute("A","D",5);
        trainPathGraph.addRoute("C","E",2);
        trainPathGraph.addRoute("E","B",3);
        trainPathGraph.addRoute("A","E",7);
    }

    //The distance of the route A-B-C.
    @Test
    public void testCalculateDistanceABC(){
        /*
        the return type of this method need to be int,
        the parameter of this method needs to be a list of nodes，it could be an Array
        then we only need to implement this method, loop this list and calculate the Distance
         */
        List<String> townList = new ArrayList();
        townList.add("A");
        townList.add("B");
        townList.add("C");

        int actualOutput =  trainPathGraph.calculateDistance(townList);

        Assert.assertEquals(9,actualOutput);

    }

    @Test
    public void testCalculateDistanceAD(){

        List<String> townList = new ArrayList();
        townList.add("A");
        townList.add("D");
        int actualOutput =  trainPathGraph.calculateDistance(townList);
        Assert.assertEquals(5, actualOutput);
    }

    @Test
    public void testCalculateDistanceADC(){

        List<String> townList = new ArrayList();
        townList.add("A");
        townList.add("D");
        townList.add("C");
        int actualOutput =  trainPathGraph.calculateDistance(townList);

        Assert.assertEquals(13,actualOutput);
    }

    @Test
    public void testCalculateDistanceAEBCD(){
        List<String> townList = new ArrayList();

        townList.add("A");
        townList.add("E");
        townList.add("B");
        townList.add("C");
        townList.add("D");
        int actualOutput =  trainPathGraph.calculateDistance(townList);

        Assert.assertEquals(22, actualOutput);
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    @Test
    public void testCalculateDistanceAED(){
        /*
        there is something need to be considered for the return type
         */
        String expectedOutput = "NO SUCH ROUTE";
        List<String> townList = new ArrayList();
        townList.add("A");
        townList.add("E");
        townList.add("D");
        expectedEx.expect(BadRequestException.class);
        expectedEx.expectMessage(expectedOutput);
        trainPathGraph.calculateDistance(townList);
    }

    /*
    The number of trips starting at C and ending at C with a maximum of 3 stops.
     In the sample data below, there are two such trips: C-D-C (2 stops). and C-E-B-C (3 stops).
     */
    @Test
    public void testTripCountLessThanStops(){
        int expectedOutput = 2;
        int actualTripsCount =  trainPathGraph.calculateTripsCountLess("C","C",3);

        Assert.assertEquals(expectedOutput, actualTripsCount);
    }

    /*
    The number of trips starting at A and ending at C with exactly 4 stops.
    In the sample data below, there are three such trips: A to C (via B,C,D); A to C (via D,C,D); and A to C (via D,E,B).
     */
    @Test
    public void testTripCountWithExactStops(){
        int expectedOutput = 3;
        int actualTripsCount =  trainPathGraph.calculateTripsCountExact("A","C",4);
        Assert.assertEquals(expectedOutput, actualTripsCount);
    }

    //the length of the shortest route (in terms of distance to travel) from A to C.
    @Test
    public void testShortestRouteAToC(){
        int expectedOutput = 9;
        int actualTripsCount =  trainPathGraph.calculateShortestPath("A","C");

        Assert.assertEquals(expectedOutput, actualTripsCount);
    }

    //The length of the shortest route (in terms of distance to travel) from B to B.
    @Test
    public void testShortestRouteBToB(){
        int expectedOutput = 9;
        int actualTripsCount =  trainPathGraph.calculateShortestPath("B","B");

        Assert.assertEquals(expectedOutput, actualTripsCount);
    }

    /*
    The number of different routes from C to C with a distance of less than 30.
    In the sample data, the trips are: CDC, CEBC, CEBCDC, CDCEBC, CDEBC, CEBCEBC, CEBCEBCEBC.
     */
    @Test
    public void testTripCountLessthanGivenDistance(){
       int expectedOutput = 7;
        int actualTripsCount =  trainPathGraph.calculateRoutesCount("C","C",30);

        Assert.assertEquals(expectedOutput, actualTripsCount);
    }

    // more test cases

    @Test
    public void testShortestRouteCToD(){
        int expectedOutput = 8;
        int actualTripsCount =  trainPathGraph.calculateShortestPath("C","D");

        Assert.assertEquals(expectedOutput, actualTripsCount);
    }
    @Test
    public void testShortestRouteAToB(){
        int expectedOutput = 5;
        int actualTripsCount =  trainPathGraph.calculateShortestPath("A","B");

        Assert.assertEquals(expectedOutput, actualTripsCount);
    }
    @Test
    public void testShortestRouteDToD(){
        int expectedOutput = 16;
        int actualTripsCount =  trainPathGraph.calculateShortestPath("D","D");

        Assert.assertEquals(expectedOutput, actualTripsCount);
    }

}
