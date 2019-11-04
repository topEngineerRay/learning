package com.dr.exam.trains.mysolution3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Ray
 */
public class TrainPathGraph {
    private List<String> townList;
    private static final String NO_SUCH_ROUTE = "NO SUCH ROUTE";

    //private final List<Edge>[] adj;
    /*
        edges[0] = A list
        edges[0] = B list
        edges[0] = C list
        edges[0] = D list
        edges[0] = E list
     */
    private List<Route>[] routes;

    private ArrayList<ArrayList<String>> allPath;
    private int to;
    private int maxDistance;
    private int stops;
    private int routesCount;
    private int tripsCount;

    public TrainPathGraph(int townCounts) {
        // the amount of the adge list is decided by the twons' counts
        townList  = new ArrayList<String>();
        if (townCounts < 0) throw new IllegalArgumentException("Number of vertices in a Graph must be positive");
        routes = (LinkedList<Route>[]) new LinkedList[townCounts];
        for (int i = 0; i < townCounts; i++) {
            routes[i] = new LinkedList<>();
        }
    }

    /*      0 1 2 3 4
            A B C D E
       0 A
       1 B
       2 C
       3 D
       4 E

       if we have a path AB5, then it is (0,0,5)in a specifc route
     */
    public void addTown(String town){
        townList.add(town);
    }

    public void addRoute(String fromTown, String toTown, int distance){
        int rowInGraph = getIndexNew(fromTown);
        int columnInGraph = getIndexNew(toTown);
        Route route = new Route(rowInGraph,columnInGraph,distance);

        int fromTownIndex = route.from();//decided wich list of edges should we insert into
        routes[fromTownIndex].add(route);
    }

    private void addEdge(Route e) {
        int v = e.from();
        routes[v].add(e);
    }

    private  List<Route> getEdgesOfATown(int v) {
        if (v < 0 || v >= townList.size()) throw new IndexOutOfBoundsException("vertex " + v + " not exists");
        return routes[v];
    }

  /*  public int calculateDistance(List<String> townList){
        int distance = calculateDistanceImplement(townList);
        if(distance==-1){
            throw new BadRequestException(NO_SUCH_ROUTE);
        }
        return distance;
    }*/

    public int calculateDistance(List<String> townList){

        if(townList == null) throw new BadRequestException("Route is wrong");

        int distance = 0;

        int from, to;
        //we do not need the third paramter, cause there is a break
        for (int i = 0; i < townList.size()-1;i++) {
            boolean hasPath = false;
            from = getIndexNew(townList.get(i));
            to = getIndexNew(townList.get(i+1));

            List<Route> routeList = getEdgesOfATown(from);

            for (Route edge : routeList)
                if (edge.to() == to) {
                    distance += edge.weight();
                    hasPath = true;
                    break;
                }

            if(!hasPath)   throw new BadRequestException(NO_SUCH_ROUTE);;
        }

        return distance;
    }

    //7
    public int calculateTripsCountExact(String from, String to, int stops){
        this.to = getIndexNew(to);
        this.stops = stops;
        this.tripsCount = 0;
        int startIndex = getIndexNew(from);
        calculateTripsCount(startIndex, String.valueOf(startIndex), stops);

        return tripsCount;
    }

    private void calculateTripsCount(int from, String path, int stops) {
        List<Route> edges = getEdgesOfATown(from);
        for (Route e: edges) {

            String next = path + e.to();
            int stopCount = next.length()-1;

            if (this.to == e.to() && stopCount ==stops )
                tripsCount++;

            if(stopCount <= stops)
                calculateTripsCount(e.to(), next, stops);
        }
    }

    //6

    public int calculateTripsCountLess(String from, String to, int stops){
        this.to = getIndexNew(to);
        this.stops = stops;
        this.tripsCount = 0;
        int startIndex = getIndexNew(from);
        calculateTripsCountLessThan(startIndex, String.valueOf(startIndex), stops);
        return tripsCount;
    }

    private void calculateTripsCountLessThan(int from, String path,int stops) {
        List<Route> edges = getEdgesOfATown(from);
        for (Route e: edges) {

            String next = path + e.to();
            int stopCount = next.length()-1;

            if (this.to == e.to() && stopCount <= stops )//meet the two requirement at the same time
                tripsCount++;

            if(stopCount <= stops)//if already > stop count, then there is no need to travel any more
                calculateTripsCountLessThan(e.to(), next, stops);
        }
    }

    public int calculateShortestPath(String from, String to){
        allPath = new ArrayList<>();
        this.to = getIndexNew(to);
        int startIndex = getIndexNew(from);

        List<String> paths = new ArrayList<>();
        paths.add(from);

        calculateShortestPath(startIndex, paths);

        int shortestDistance = Integer.MAX_VALUE, currentDistance;
        for(List list: allPath){

            currentDistance = calculateDistance(list);

            if(shortestDistance > currentDistance)
                shortestDistance = currentDistance;
        }

        if(shortestDistance == Integer.MAX_VALUE) return 0;

        return shortestDistance;
    }

    private void calculateShortestPath(int from, List<String> paths) {
        List<Route> edges = getEdgesOfATown(from);
        for (Route e: edges) {

            /*
            if (path.length()>1 && path.substring(1).contains(String.valueOf(e.to()))) //checked visited or not
                continue;
            */
            //if the first condition not match, then it will not go to the second condition
            if (paths.size()>1 && paths.subList(1,paths.size()).contains(getTownName(e.to()))) //checked if a town is visited or not
                continue;

            //String next = path + e.to();
            List pathTry = new ArrayList(paths);

            pathTry.add(getTownName(e.to()));

            if (this.to == e.to())
                allPath.add((ArrayList<String>) pathTry);

                //allPath.add(getPathName(next));

            calculateShortestPath(e.to(), pathTry);
        }
    }


    public int calculateRoutesCount(String from, String to, int maxDistance){
        this.to = getIndexNew(to);//save the destination
        this.maxDistance = maxDistance;
        this.routesCount = 0;
        int startIndex = getIndexNew(from);

        List<String> paths = new ArrayList<>();
        paths.add(from);

        calculateRoutesCount(startIndex, paths);

        return routesCount;
    }

    private void calculateRoutesCount(int from, List<String> paths) {
        List<Route> edges = getEdgesOfATown(from);
        for (Route e: edges) {

            //be very careful here we can not just modify paths,we have to new another object
            List pathTry = new ArrayList(paths);

            pathTry.add(getTownName(e.to()));
            //String next = path + e.to();

            int distance = calculateDistance(pathTry);

            if (this.to == e.to() && (distance < maxDistance)) {
                System.out.println(distance);
                System.out.println(pathTry.toString());
                routesCount++;
            }
            if(distance < maxDistance)
                calculateRoutesCount(e.to(), pathTry);

        }
    }

    private String getTownName(int index){
        if (index < 0 || index >= townList.size())
            throw new IllegalArgumentException("Wrong index");
        return townList.get(index);
    }

    private String getPathName(String path){
        String arr[] = path.trim().split("");
        String name = "";
        for(String v: arr)
            name += getTownName(Integer.parseInt(v));

        return name;
    }
    private int getIndexNew(String town){
        for(int i = 0;i<townList.size();i++){
            if(townList.get(i).equals(town)) {
                return i;//this i repepresent which list of edges should we loop when build a path
            }
        }
        return -1;
    }
}