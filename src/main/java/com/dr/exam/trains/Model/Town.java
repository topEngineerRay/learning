package com.dr.exam.trains.Model;

public class Town {
    private String townName;
    public boolean visited;//check if have visit this town when path

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
        this.visited = false;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Town(String townName) {
        this.townName = townName;
    }
}
