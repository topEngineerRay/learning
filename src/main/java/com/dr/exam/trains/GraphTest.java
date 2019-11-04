package com.dr.exam.trains;



import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GraphTest {

    Graph graph = new Graph();

    @Before
    public void prepareGraph(){
        graph.insertVertex("A");
        graph.insertVertex("B");
        graph.insertVertex("C");
        graph.insertVertex("D");
        graph.insertVertex("E");

        graph.insertEdge("A", "B", 5);
        graph.insertEdge("B", "C", 4);
        graph.insertEdge("C", "D", 8);
        graph.insertEdge("D", "C", 8);
        graph.insertEdge("D", "E", 6);
        graph.insertEdge("A", "D", 5);
        graph.insertEdge("C", "E", 2);
        graph.insertEdge("E", "B", 3);
        graph.insertEdge("A", "E", 7);

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

            List<String> townList = new ArrayList();
            townList.add("A");
            townList.add("B");
            townList.add("C");

            int actualOutput =  graph.calculateDistanceOfSpecificRoute(townList);
            Assert.assertEquals(expectedOutput,actualOutput);

        }


        @Test
        public void testAD(){
            int expectedOutput = 5;

            List<String> townList = new ArrayList();
            townList.add("A");
            townList.add("D");
            int actualOutput =  graph.calculateDistanceOfSpecificRoute(townList);

            Assert.assertEquals(expectedOutput, actualOutput);

        }

        @Test
        public void testADC(){
            int expectedOutput = 13;
            List<String> townList = new ArrayList();
            townList.add("A");
            townList.add("D");
            townList.add("C");

            int actualOutput =  graph.calculateDistanceOfSpecificRoute(townList);

            Assert.assertEquals(expectedOutput, actualOutput);


        }

        @Test
        public void testAEBCD(){
            int expectedOutput = 22;
            List<String> townList = new ArrayList();
            townList.add("A");
            townList.add("E");
            townList.add("B");
            townList.add("C");
            townList.add("D");

            int actualOutput =  graph.calculateDistanceOfSpecificRoute(townList);
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
            List<String> townList = new ArrayList();
            townList.add("A");
            townList.add("E");
            townList.add("D");
            expectedEx.expect(BadRequestException.class);
            expectedEx.expectMessage(expectedOutput);
            graph.calculateDistanceOfSpecificRoute(townList);
        }

        /*
        The number of trips starting at C and ending at C with a maximum of 3 stops.
         In the sample data below, there are two such trips: C-D-C (2 stops). and C-E-B-C (3 stops).
         */
        @Test
        public void testCCWithLessThan4StopsTripCount(){
            int expectedOutput = 2;
            int actualTripsCount =  graph.calculateDistanceWithLessThan4Stops("C","C",3);
            Assert.assertEquals(expectedOutput, actualTripsCount);

        }

        /*
        The number of trips starting at A and ending at C with exactly 4 stops.
        In the sample data below, there are three such trips: A to C (via B,C,D); A to C (via D,C,D); and A to C (via D,E,B).
         */
        @Test
        public void testACWith4StopsTripCount(){
            int expectedOutput = 3;
            int actualTripsCount =  graph.calculateDistanceWith4Stops("A","C",4);

            Assert.assertEquals(expectedOutput, actualTripsCount);
        }

        //the length of the shortest route (in terms of distance to travel) from A to C.
        @Test
        public void testACShortestRoute(){
            int expectedOutput = 9;
            int actualTripsCount =  graph.calculateShortestDistance("A","C",0);

            Assert.assertEquals(expectedOutput, actualTripsCount);
        }

        //The length of the shortest route (in terms of distance to travel) from B to B.
        @Test
        public void testBBShortestRoute(){
            int expectedOutput = 9;
            int actualTripsCount =  graph.calculateShortestDistance("B","B",0);

            Assert.assertEquals(expectedOutput, actualTripsCount);
        }

        /*
        The number of different routes from C to C with a distance of less than 30.
        In the sample data, the trips are: CDC, CEBC, CEBCDC, CDCEBC, CDEBC, CEBCEBC, CEBCEBCEBC.
         */
        @Test
        public void testCCLessthan30TripCount(){
            int expectedOutput = 7;
            int actualTripsCount =  graph.calculateTripsCountLessThanGivenDistance("C","C",30);

            Assert.assertEquals(expectedOutput, actualTripsCount);
        }

}