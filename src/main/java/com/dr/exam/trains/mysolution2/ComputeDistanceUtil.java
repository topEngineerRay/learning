package com.dr.exam.trains.mysolution2;


import com.dr.exam.trains.BadRequestException;
import com.dr.exam.trains.Model.Route;
import com.dr.exam.trains.Model.Town;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ComputeDistanceUtil {

    private static final String NO_SUCH_ROUTE = "NO SUCH ROUTE";

    private HashMap<String, Route> graph;//the directed graph

    private HashMap<String, Town> towns;

    public ComputeDistanceUtil() {
        this.graph = new HashMap<>();
        this.towns = new HashMap<>();
    }

    public void addTown(Town town){
        towns.put(town.getTownName(),town);
    }
    // AB5, AD5
    //A, AB5
    public void addRoute(String townName,Route route){
        Route routeInMap = graph.get(townName);
        if(routeInMap == null) {
            graph.put(townName, route);
        }
        else if(routeInMap.nextRoute == null){
            routeInMap.nextRoute = route;
        }
        else{
            //draw the graph here
            Route next = routeInMap.nextRoute;
            while(next.nextRoute!=null){
                next = next.nextRoute;//until find the last route
            }
            next.nextRoute = route;
        }
    }

    public int calculateDistanceOfSpecificRoute(List<String> townList) {

        int totalDistance = 0;

        if(townList.size()<2){
            throw new BadRequestException(NO_SUCH_ROUTE);
        }

        //we have to loop between 0 to size - 1, cause the distance has to be calculated with two towns
        for(int i = 0; i < townList.size()-1; i++){

            int distance = checkAndReturnDitance(townList.get(i),townList.get(i+1));
            if(distance==-1){
                throw new BadRequestException(NO_SUCH_ROUTE);
            }
            totalDistance += distance;
        }

        return totalDistance;

    }

    /*
     This method is only for calculating the two towns' direct path
     */
    private int checkAndReturnDitance(String fromTown,String toTown){
        //A D C
        /*
          A | {B,5}, {D,5}, {E,7}
          B | {C,4}
          C | {D,8}, {E,2}
          D | {C,8}, {E,6}
          E | {B,3}
         */
        Route route = graph.get(fromTown);

        if(route == null){
            return -1;
        }
        while(route!=null){
            if(route.getToTown().getTownName().equals(toTown))
                {
                    return route.getDistance();
                }
                route = route.nextRoute;
         }

        return -1;

    }

    //there are two such trips: C-D-C (2 stops). and C-E-B-C (3 stops).
    /*
          A | {B,5}, {D,5}, {E,7}
          B | {C,4}
          C | {D,8}, {E,2}
          D | {C,8}, {E,6}
          E | {B,3}
     */
    int totalCount6 = 0;
    /*public int calculateTripCountsWithLessThan4Stops(Town fromTown, Town toTown, int maxStops) {

        String fromName = fromTown.getTownName();
        String toName = toTown.getTownName();
        if (graph.containsKey(fromName) && graph.containsKey(toName)) {
            //each time check the maxStops
            if (maxStops > 0) {
                Route route = graph.get(fromName);

                //loop all the route the start from this node
                while(route!=null){

                    if (route.getToTown().getTownName().equals(toName)) {
                        totalCount6++;
                        *//*
                         there  can be serval situations that ,
                         lets suppose there is a way CDC, and another way CDEC,
                         which means We have to also check the CDEC, and every possible way from D.
                         *//*
                        route = route.nextRoute;
                        continue;
                    } else if (!route.getToTown().isVisited()) {
                        calculateTripCountsWithLessThan4Stops(route.getToTown(),
                                toTown, maxStops-1);
                    }
                }
            }

        }
        else {
            throw new BadRequestException("no routes");
        }
        return totalCount6;

    }*/
    public int calculateTripCountsWithLessThan4Stops(Town fromTown, Town toTown, int maxStops){
        return findRoutes(fromTown,toTown,maxStops);
    }
    private int findRoutes(Town origin, Town dest , int limit) {
        int routes = 0;
        if (limit > 0) {
            if (graph.containsKey(origin.getTownName()) && graph.containsKey(dest.getTownName())) {

                origin.visited = true;

                Route edge = this.graph.get(origin.getTownName());
                while (edge != null) {
                    if (edge.toTown.equals(dest)) {
                        routes++;
                        edge = edge.nextRoute;
                        //用来结束当前循环，并进入下一次循环，即仅仅这一次循环结束了，不是所有循环结束了，后边的循环依旧进行
                        continue;
                    } else if (!edge.toTown.visited) {
                        routes += findRoutes(edge.toTown, dest, limit-1);
                    }
                    edge = edge.nextRoute;
                }
            } else {
            }
        }
        origin.visited = false;
        return routes;
    }


    //A to C (via B,C,D); A to C (via D,C,D); and A to C (via D,E,B)
    //ABCDC, ADCDC, ADEBC
    //43210
    public int calculateDistanceWith4Stops(Town fromTown, Town toTown, int stops) {
        int routes = 0;
        if (stops >= 0) {
            if (graph.containsKey(fromTown.getTownName()) && graph.containsKey(toTown.getTownName())) {

                fromTown.visited = true;
                Route edge = this.graph.get(fromTown.getTownName());
                while (edge != null) {
                    if (edge.toTown.equals(toTown)&&stops == 0) {
                        routes++;
                        System.out.println(edge.fromTown.getTownName()+"->"+toTown.getTownName());
                        edge = edge.nextRoute;
                        //用来结束当前循环，并进入下一次循环，即仅仅这一次循环结束了，不是所有循环结束了，后边的循环依旧进行

                        continue;
                    } else if (!edge.toTown.visited) {
                        routes += calculateDistanceWith4Stops(edge.toTown, toTown, stops-1);
                    }
                    edge = edge.nextRoute;
                }
            }
        } else {
        }
        fromTown.visited = false;
        return routes;

       /* if (stops >= 0) {
            //for (Route route : routes) {
            for(int i =0;i<routes.size();i++) {
                //A given route will never appear more than once, and for a given route,
                // the starting and ending town will not be the same town.

                if (routes.get(i).getFromTown().getTownName().equals(fromTown) && routes.get(i).getToTown().getTownName().equals(toTown)&& stops == 0) {
                    totalCount7++;
                }
                if (routes.get(i).getFromTown().getTownName().equals(fromTown)) {
                    calculateDistanceWith4Stops(routes.get(i).getToTown().getTownName(), toTown, stops - 1);
                    //fromTownRoutes.add(route);
                }
            }
        }*/
    }


    int totalCount10 = 0;
    //c c 30
    /*
    public int calculateDistanceWithLessThan30Distance(String fromTown, String toTown, int distance) {

        if (distance >0) {
            //for (Route route : routes) {
            for(int i =0;i<routes.size();i++) {
                //A given route will never appear more than once, and for a given route,
                // the starting and ending town will not be the same town.

                if (routes.get(i).getFromTown().getTownName().equals(fromTown) && routes.get(i).getToTown().getTownName().equals(toTown)) {
                    totalCount10++;
                }
                if (routes.get(i).getFromTown().getTownName().equals(fromTown)) {
                    calculateDistanceWithLessThan30Distance(routes.get(i).getToTown().getTownName(), toTown, distance - routes.get(i).getDistance());
                    //fromTownRoutes.add(route);
                }
            }
        }
        return totalCount10;
    }
       */
    public int findShortestRoute(Town origin, Town dest){
        return findShortestRoute(origin,dest,0,0);
    }
    public int findShortestRoute(Town origin, Town dest,int distance,int shortestPath){
        //if(this.routingTable.containsKey(origin) && this.routingTable.containsKey(dest)) {
            if(graph.containsKey(origin.getTownName()) && graph.containsKey(dest.getTownName())){
                origin.visited = true;
                Route edge = this.graph.get(origin);
                while (edge != null) {
                    if (edge.toTown.equals(dest) || !edge.toTown.visited) {
                        distance += edge.distance;
                    }

                    if (edge.toTown.equals(dest)) {
                        if (shortestPath == 0 || distance < shortestPath)
                            shortestPath = distance;
                        origin.visited = false;
                        return shortestPath;
                    }
              /*Some backtracking and recursion */
                    else if (!edge.toTown.visited) {
                        shortestPath = findShortestRoute(edge.toTown, dest,distance,shortestPath);
                        distance -= edge.distance;
                    }
                    edge = edge.nextRoute;
                }
        }
        else{

        }

        origin.visited = false;
        return shortestPath;
    }

   /* public int findShortestRoute1(Town origin, Town dest, int distance, int shortestPath){
        if(this.routingTable.containsKey(origin) && this.routingTable.containsKey(dest)) {
            origin.visited = true;
            Edge edge = this.routingTable.get(origin);
            while(edge != null) {
                if(edge.destination == dest || !edge.destination.visited){
                    distance += edge.weight;
                }

                if(edge.destination.equals(dest)) {
                    if(shortestPath == 0 || distance < shortestPath)
                        shortestPath = distance;
                    origin.visited = false;
                    return shortestPath;
                }
              *//*Some backtracking and recursion *//*
                else if(!edge.destination.visited) {
                    shortestPath = findShortestRoute(edge.destination, dest, distance, shortestPath);
                    distance -= edge.weight;
                }
                edge = edge.next;
            }
        }
        else{
            noRouteException();
        }

        origin.visited = false;
        return shortestPath;
    }*/
}
