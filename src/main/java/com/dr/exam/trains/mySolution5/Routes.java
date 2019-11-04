/**
  Graph implementation of the routing problem
*/

package com.dr.exam.trains.mySolution5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class Routes {
  public HashMap<Town, Edge> routingTable;

  public Routes() {
    this.routingTable = new HashMap<Town, Edge>();
  }

  public HashMap<Town, Edge> getRoutingTable() {
    return routingTable;
  }

  public int findDistanceBetweenTowns(ArrayList<Town>towns) throws NoSuchRouteException {

    if (towns.size()<2){
      return 0;
    }

    int distance, depth, index;
    distance = depth = index = 0;

    while (index < towns.size()-1){
         if(this.routingTable.containsKey(towns.get(index))) {
                Edge route = this.routingTable.get(towns.get(index));
                while(route != null) {
                    if(route.destination.equals(towns.get(index + 1))) {
                        distance += route.weight;
                        depth++;
                        break;
                    }
                    route = route.next;
                }
            }
            else
                throw new NoSuchRouteException();
            index++;
        }

        if(depth != towns.size() - 1){
            throw new NoSuchRouteException();
        }
      return distance;
  }

  public int numberOfStopsBetweenTowns(Town origin, Town destination, int limit){
    return findRoutes(origin, destination, 0,limit);
  }
    public int findRoutesCountLessThanLimit(Town origin, Town dest , int limit) {
        int routes = 0;
        if (limit > 0) {
            if (this.routingTable.containsKey(origin) && this.routingTable.containsKey(dest)) {

                origin.visited = true;

                Edge edge = this.routingTable.get(origin);
                while (edge != null) {
                    if (edge.destination.equals(dest)) {
                        routes++;
                        edge = edge.next;
                        //用来结束当前循环，并进入下一次循环，即仅仅这一次循环结束了，不是所有循环结束了，后边的循环依旧进行
                        continue;
                    } else if (!edge.destination.visited) {
                        routes += findRoutesCountLessThanLimit(edge.destination, dest, limit-1);
                    }
                    edge = edge.next;
                }
            } else {
            }
        }
        origin.visited = false;
        return routes;
    }
    public int findRoutesWithExactStop(Town origin, Town dest, int limit) {
        int routes = 0;
        if(this.routingTable.containsKey(origin) && this.routingTable.containsKey(dest)) {
            limit--;
            origin.visited = true;

            Edge edge = this.routingTable.get(origin);
            while(edge != null) {
                if(edge.destination.equals(dest)&& limit==0) {
                    routes++;
                    edge = edge.next;
                    continue; //用来结束当前循环，并进入下一次循环，即仅仅这一次循环结束了，不是所有循环结束了，后边的循环依旧进行
                }
                else if(!edge.destination.visited) {
                    routes += findRoutesWithExactStop(edge.destination, dest, limit);

                }
                edge = edge.next;
            }
        }
        else{
            noRouteException();
        }

        origin.visited = false;
        return routes;
    }

  private int findRoutes(Town origin, Town dest, int depth, int limit) {
        int routes = 0;
        if(this.routingTable.containsKey(origin) && this.routingTable.containsKey(dest)) {
            depth++;
            origin.visited = true;

            Edge edge = this.routingTable.get(origin);
            while(edge != null) {
                if(edge.destination.equals(dest)&& depth==limit) {
                    routes++;
                    edge = edge.next;
                    continue; //用来结束当前循环，并进入下一次循环，即仅仅这一次循环结束了，不是所有循环结束了，后边的循环依旧进行
                }
                else if(!edge.destination.visited) {
                    routes += findRoutes(edge.destination, dest, depth, limit);

                }
                edge = edge.next;
            }
        }
        else{
          noRouteException();
        }

        origin.visited = false;
        return routes;
    }

  public int shortestRouteBetweenTowns(Town origin, Town destination){
    return findShortestRoute(origin, destination, 0, 0);
  }

  public int findShortestRoute(Town origin, Town dest, int distance, int shortestPath){
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
              /*Some backtracking and recursion */
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
  }

    /*
     * Find number of routes between towns;
     */
  public int numRoutesWithin(Town origin, Town dest, int maxDistance) {
        return findAllRoutesBetweenTowns(origin, dest, 0, maxDistance);
    }

    private int findAllRoutesBetweenTowns(Town origin, Town destination, int weight, int maxDistance){
        int routes = 0;
        if(this.routingTable.containsKey(origin) && this.routingTable.containsKey(destination)) {

            Edge edge = this.routingTable.get(origin);
            while(edge != null) {
                weight += edge.weight;
                if(weight <= maxDistance) {
                    if(edge.destination.equals(destination)) {
                        routes++;
                        routes += findAllRoutesBetweenTowns(edge.destination, destination, weight, maxDistance);
                        edge = edge.next;
                        continue;
                    }
                    else {
                        routes += findAllRoutesBetweenTowns(edge.destination, destination, weight, maxDistance);
                        weight -= edge.weight;
                    }
                }
                else
                    weight -= edge.weight;

                edge = edge.next;
            }
        }
        else{
            noRouteException();

          }
        return routes;

    }


  public void noRouteException() {
    System.out.println("NO SUCH ROUTE");

  }

     class NoSuchRouteException extends Exception {
        @Override
        public String getMessage(){
            return "NO SUCH ROUTE";
        }
    }
}

