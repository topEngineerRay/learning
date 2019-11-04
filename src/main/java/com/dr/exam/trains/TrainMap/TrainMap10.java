package com.dr.exam.trains.TrainMap;

public class TrainMap10 {
    public int[][] map = {
            {-1, 5, -1, 5, 7},
            {-1, -1, 4, -1, -1},
            {-1, -1, -1, 8, 2},
            {-1, -1, 8, -1, 6},
            {-1, 3, -1, -1, -1},
    };

    int totoal = 0;
    public int dfs(String end, String path, int cost) {
        if (cost >= 30)
            return -1;

        if (cost > 0 && path.endsWith(end)) {
            totoal++;
            System.out.println(path + ", " + cost);
        }

        char lastChar = path.charAt(path.length() - 1);
        int lastNodeIndex = lastChar - 'A';

        for (int i = 0; i < map[lastNodeIndex].length; i++) {
            char newChar = (char) (i + 'A');
            int newCost = map[lastNodeIndex][i];
            if (newCost > 0) {
                dfs(end, path + newChar, cost + newCost);
            }
        }
        return totoal;
    }

    public static void main(String[] args) {
        TrainMap10 g = new TrainMap10();

       int trips = g.dfs("C", "C", 0);
       System.out.println("count" + ", " + trips);
    }
}
