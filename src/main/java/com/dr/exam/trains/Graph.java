package com.dr.exam.trains;


import java.util.*;

public class Graph {

    private static final String NO_SUCH_ROUTE = "NO SUCH ROUTE";

    Map<String, Vertex> vertexsMap;           //存储所有的顶点

    private class Vertex {
        private String name;        //顶点名称
        private Edge next;          //下一段弧

        Vertex(String name, Edge next) {
            this.name = name;
            this.next = next;
        }
    }

    private class Edge {
        private String name;        //被指向顶点名称
        private int weight;         //弧的权值
        private Edge next;          //下一段弧

        Edge(String name, int weight, Edge next) {
            this.name = name;
            this.weight = weight;
            this.next = next;
        }
    }

    public Graph() {
        this.vertexsMap = new HashMap<>();
    }

    public void insertVertex(String vertexName) {                //添加顶点
        Vertex vertex = new Vertex(vertexName, null);
        vertexsMap.put(vertexName, vertex);
    }

    public void insertEdge(String begin, String end, int weight) {           //添加弧
        Vertex beginVertex = vertexsMap.get(begin);
        if (beginVertex == null) {
            beginVertex = new Vertex(begin, null);
            vertexsMap.put(begin, beginVertex);
        }

        Edge edge = new Edge(end, weight, null);
        if (beginVertex.next == null) {
            beginVertex.next = edge;
        } else {
            Edge lastEdge = beginVertex.next;
            while (lastEdge.next != null) {//until find the last edge
                lastEdge = lastEdge.next;
            }
            lastEdge.next = edge;
        }
    }

    public void print() {
        //打印图
        Set<Map.Entry<String, Vertex>> set = vertexsMap.entrySet();
        Iterator<Map.Entry<String, Vertex>> iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Vertex> entry = iterator.next();
            Vertex vertex = entry.getValue();

            Edge edge = vertex.next;
            while (edge != null) {
                System.out.println(vertex.name + " 指向 " + edge.name + " 权值为：" + edge.weight);
                edge = edge.next;
            }
        }
    }

    public int calculateDistanceOfSpecificRoute(List<String> vertexName) {

        int totalDistance = 0;

        //we have to loop between 0 to size - 1, cause the distance has to be calculated with two towns
        for (int i = 0; i < vertexName.size() - 1; i++) {

            int distance = checkAndReturnDitance(vertexName.get(i), vertexName.get(i + 1));
            if (distance == -1) {
                throw new BadRequestException(NO_SUCH_ROUTE);
            }
            totalDistance += distance;
        }
        return totalDistance;
    }

    /*
    This method is only for calculating the two towns' direct path
    */
    private int checkAndReturnDitance(String fromTown, String toTown) {

        Edge edge = vertexsMap.get(fromTown).next;
        while (edge != null) {
            if (edge.name.equals(toTown)) {
                return edge.weight;
            }
            edge = edge.next;
        }
        return -1;

    }


    int totalCount = 0;

    /*
    fromTown C  toTown C
     */
    public int calculateDistanceWithLessThan4Stops(String fromTown, String toTown, int maxStops) {

        if (maxStops > 0) {
            Edge edge = vertexsMap.get(fromTown).next;
            while (edge != null) {
                if (edge.name.equals(toTown)) {
                    totalCount++;
                } else {
                    calculateDistanceWithLessThan4Stops(edge.name, toTown, maxStops - 1);
                }
                edge = edge.next;
            }
        }

        return totalCount;
    }

    /*
    A C
     */
    int totalCount4Stops = 0;

    public int calculateDistanceWith4Stops(String fromTown, String toTown, int stops) {

        if (stops >= 0) {//if not judge,then stackOverFlow,Because C D can go to each others
            Edge edge = vertexsMap.get(fromTown).next;
            while (edge != null) {
                if (edge.name.equals(toTown) && stops == 0) {
                    totalCount4Stops++;
                } else {
                    calculateDistanceWith4Stops(edge.name, toTown, stops - 1);
                }
                edge = edge.next;
            }
        }
        return totalCount4Stops;
    }

    /*

     */
    int totalDistance89 = 0;
    public int calculateShortestDistance(String fromTown, String toTown,int cost) {
        Edge edge = vertexsMap.get(fromTown).next;

        while (edge != null) {
            if (edge.name.equals(toTown) ) {
                totalDistance89++;
            } else {
                calculateShortestDistance(edge.name, toTown,edge.weight+cost);
            }
            edge = edge.next;
        }

        return totalDistance89;
    }


    int totalCount10 = 0;
    int totalDistance = 0;
    String path = "";
    /*
       The number of different routes from C to C with a distance of less than 30.
       In the sample data, the trips are: CDC, CEBC, CEBCDC, CDCEBC, CDEBC, CEBCEBC, CEBCEBCEBC.
        */
    public int calculateTripsCountLessThanGivenDistance(String fromTown, String toTown, int maxDistance) {

            Edge edge = vertexsMap.get(fromTown).next;
            path += fromTown;
            while (edge != null) {
                if (edge.name.equals(toTown) && totalDistance < maxDistance) {
                    totalDistance =0;
                    path+=toTown;
                    System.out.println(path);
                    totalCount10++;
                }
                else {
                    totalDistance += edge.weight;
                    calculateTripsCountLessThanGivenDistance(edge.name, toTown, maxDistance);
                }
                totalDistance = 0;
                edge = edge.next;
        }
        return totalCount10;
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
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

        graph.print();
    }
}

