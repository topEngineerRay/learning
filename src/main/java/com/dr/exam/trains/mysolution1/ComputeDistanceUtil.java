package com.dr.exam.trains.mysolution1;


import com.dr.exam.trains.BadRequestException;
import com.dr.exam.trains.Model.Route;
import com.dr.exam.trains.Model.Town;

import java.util.Arrays;
import java.util.List;

public class ComputeDistanceUtil {

    private static final String NO_SUCH_ROUTE = "NO SUCH ROUTE";

    private List<Route> routes;//the directed graph
    private static final String[] VERTEX_LIST = {"A", "B", "C", "D", "E"};
    //private final List<Edge>[] adj;
    private int toTown;
    private int maxDistance;
    private int routesCount;

    public ComputeDistanceUtil(List<Route> routes) {
        this.routes = routes;
    }

    public int calculateDistanceOfSpecificRoute(List<Town> townList) {

        int totalDistance = 0;

        if(townList.size()<2){
            throw new BadRequestException("The distance does not make sense when there are less than 2 towns");
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
    private int checkAndReturnDitance(Town fromTown,Town toTown){

        boolean fromTownMatches;
        boolean toTownMatches;

        for(int j = 0;j<routes.size();j++){

            fromTownMatches = routes.get(j).getFromTown().equals(fromTown);
            toTownMatches = routes.get(j).getToTown().equals(toTown);
            //in case there is a route,return its distance,else return -1;
            if (fromTownMatches && toTownMatches){
                return routes.get(j).getDistance();
            }
        }

        return -1;

    }

    int totalCount = 0;
    String path;

    public int calculateDistanceWithLessThan4Stops(String fromTown, String toTown, int maxStops) {

        if (maxStops>0) {
            //for (Route route : routes) {
                for(int i =0;i<routes.size();i++){
                //A given route will never appear more than once, and for a given route,
                // the starting and ending town will not be the same town.

                if (routes.get(i).getFromTown().getTownName().equals(fromTown) && routes.get(i).getToTown().getTownName().equals(toTown)) {
                    totalCount++;
                }
                if (routes.get(i).getFromTown().getTownName().equals(fromTown)) {
                    calculateDistanceWithLessThan4Stops(routes.get(i).getToTown().getTownName(), toTown, maxStops-1);
                    //fromTownRoutes.add(route);
                }
            }
        }
        return totalCount;
    }

    int totalCount7 = 0;

    public int calculateDistanceWith4Stops(String fromTown, String toTown, int stops) {

        if (stops >= 0) {
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
        }
        return totalCount7;
    }

    int totalCount10 = 0;
    //c c 30
    public int calculateTripsCountWithLimitation(String fromTown, String toTown, int distance) {
/*
        this.toTown = getIndex(toTown);
        this.maxDistance = distance;
        this.routesCount = 0;
        int startIndex = getIndex(fromTown);
        calculateRoutesCount(startIndex, String.valueOf(startIndex));*/

        /*if (distance >0) {
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
        */
        return totalCount10;
    }

   /* private void calculateRoutesCount(int from, String path) {
        List<Route> edges = routes(from);
        for (Edge e: edges) {

            String next = path + e.to();
            int distance = calculateDistance(getPathName(next));

            if (this.to == e.to() && (distance < maxDistance))
                routesCount++;

            if(distance < maxDistance)
                calculateRoutesCount(e.to(), next);
        }
    }
    private List<Edge> adj(int v) {
        if (v < 0 || v >= VERTEX_LIST.length) throw new IndexOutOfBoundsException("vertex " + v + " not exists");
        return adj[v];
    }
    private static int getIndex(String vertex) {
        int index = Arrays.binarySearch(VERTEX_LIST, vertex);
        if (index < 0)
            throw new IllegalArgumentException("Wrong input");

        return index;
    }*/
}
