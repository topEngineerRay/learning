package com.dr.exam.trains.mysolution1;

import com.dr.exam.trains.BadRequestException;
import com.dr.exam.trains.Model.Route;
import com.dr.exam.trains.Model.Town;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

public class ComputeDistanceTest {

    /*
    Expected Output:
    Output #1: 9
    Output #2: 5
    Output #3: 13
    Output #4: 22
    Output #5: NO SUCH ROUTE
    Output #6: 2
    Output #7: 3
    Output #8: 9
    Output #9: 9
    Output #10: 7
     */

    /*
    1~5 are the same kind of problem
    6,7,10 are the same kind of problem
    8,9 are the same kind of problem

    preparation

    before the test,we should build a graph with: AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7
    maybe can init on the below constructor,Parameters should be an array of the paths

    from oo aspect, i define the node as an object instead of just use String
    */

    Town townA = new Town("A");
    Town townB = new Town("B");
    Town townC = new Town("C");
    Town townD = new Town("D");
    Town townE = new Town("E");

    Route routeAB = new Route(townA,townB,5);
    Route routeBC = new Route(townB,townC,4);
    Route routeCD = new Route(townC,townD,8);
    Route routeDC = new Route(townD,townC,8);

    Route routeDE = new Route(townD,townE,6);
    Route routeAD = new Route(townA,townD,5);
    Route routeCE = new Route(townC,townE,2);
    Route routeEB = new Route(townE,townB,3);
    Route routeAE = new Route(townA,townE,7);


    List<Route> routes = new ArrayList<>();


    ComputeDistanceUtil computeDistanceUtil;

    @Before
    public void prepareGraph(){

        routes.add(routeAB);
        routes.add(routeBC);
        routes.add(routeCD);
        routes.add(routeDC);
        routes.add(routeDE);
        routes.add(routeAD);
        routes.add(routeCE);
        routes.add(routeEB);
        routes.add(routeAE);

        //draw the directed graph

        computeDistanceUtil= new ComputeDistanceUtil(routes);
    }

    //The distance of the route A-B-C.
    @Test
    public void testABC(){

        int expectedOutput = 9;
        /*
        the return type of this method need to be int,
        the parameter of this method needs to be a list of nodes，it could be an Array
        then we only need to implement this method, loop this list and calculate the Distance
         */

        List<Town> townList = new ArrayList();
        townList.add(townA);
        townList.add(townB);
        townList.add(townC);

        int actualOutput =  computeDistanceUtil.calculateDistanceOfSpecificRoute(townList);

        Assert.assertEquals(expectedOutput,actualOutput);

    }


    @Test
    public void testAD(){
        int expectedOutput = 5;

        List<Town> townList = new ArrayList();
        townList.add(townA);
        townList.add(townD);

        int actualOutput =  computeDistanceUtil.calculateDistanceOfSpecificRoute(townList);

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testADC(){
        int expectedOutput = 13;

        List<Town> townList = new ArrayList();
        townList.add(townA);
        townList.add(townD);
        townList.add(townC);
        int actualOutput =  computeDistanceUtil.calculateDistanceOfSpecificRoute(townList);

        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void testAEBCD(){
        int expectedOutput = 22;

        List<Town> townList = new ArrayList();
        townList.add(townA);
        townList.add(townE);
        townList.add(townB);
        townList.add(townC);
        townList.add(townD);

        int actualOutput =  computeDistanceUtil.calculateDistanceOfSpecificRoute(townList);

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    @Test
    public void testAED(){
        /*
        there is something need to be considered for the return type
         */
        String expectedOutput = "NO SUCH ROUTE";
        List<Town> townList = new ArrayList();
        townList.add(townA);
        townList.add(townE);
        townList.add(townD);
        expectedEx.expect(BadRequestException.class);
        expectedEx.expectMessage(expectedOutput);
        computeDistanceUtil.calculateDistanceOfSpecificRoute(townList);
    }

    /*
    The number of trips starting at C and ending at C with a maximum of 3 stops.
     In the sample data below, there are two such trips: C-D-C (2 stops). and C-E-B-C (3 stops).
     */
    @Test
    public void testCCWithLessThan4StopsTripCount(){
        int expectedOutput = 2;
        int actualTripsCount =  computeDistanceUtil.calculateDistanceWithLessThan4Stops(townC.getTownName(),townC.getTownName(),3);

        Assert.assertEquals(expectedOutput, actualTripsCount);
    }

    /*
    The number of trips starting at A and ending at C with exactly 4 stops.
    In the sample data below, there are three such trips: A to C (via B,C,D); A to C (via D,C,D); and A to C (via D,E,B).
     */
    @Test
    public void testACWith4StopsTripCount(){
        int expectedOutput = 3;
        int actualTripsCount =  computeDistanceUtil.calculateDistanceWith4Stops(townA.getTownName(),townC.getTownName(),4);

        Assert.assertEquals(expectedOutput, actualTripsCount);
    }

    //the length of the shortest route (in terms of distance to travel) from A to C.
    @Test
    public void testACShortestRoute(){


    }

    //The length of the shortest route (in terms of distance to travel) from B to B.
    @Test
    public void testBBShortestRoute(){

    }

    /*
    The number of different routes from C to C with a distance of less than 30.
    In the sample data, the trips are: CDC, CEBC, CEBCDC, CDCEBC, CDEBC, CEBCEBC, CEBCEBCEBC.
     */
    @Test
    public void testCCLessthan30TripCount(){
        int expectedOutput = 7;
        int actualTripsCount =  computeDistanceUtil.calculateTripsCountWithLimitation(townC.getTownName(),townC.getTownName(),30);

        Assert.assertEquals(expectedOutput, actualTripsCount);
    }

}