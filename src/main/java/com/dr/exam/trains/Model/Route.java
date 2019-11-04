package com.dr.exam.trains.Model;


public class Route {
    public Town fromTown;
    public Town toTown;
    public int distance;
    public Route nextRoute;//this virable is used to draw the graph
    /*
     A| B5, D5, E7
     B| C4
     C| D8, E2,
     D| C8, E6
     E| B3
     */
    public Route(Town fromTown, Town toTown, int distance) {
        this.fromTown = fromTown;
        this.toTown = toTown;
        this.distance = distance;
        this.nextRoute = null;
    }
    public Route next(Route route) {
        this.nextRoute = route;
        return this;
    }
    public Town getFromTown() {
        return fromTown;
    }

    public Town getToTown() {
        return toTown;
    }

    public int getDistance() {
        return distance;
    }

    public void setFromTown(Town fromTown) {
        this.fromTown = fromTown;
    }

    public void setToTown(Town toTown) {
        this.toTown = toTown;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
