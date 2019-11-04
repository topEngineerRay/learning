package com.dr.exam.trains.mysolution3;

/**
 *
 * @author MM <mushfiqazeri@gmail.com>
 */
public class Route {

    private final int from;
    private final int to;
    private final int weight;

    public Route(int from, int to, int weight) {
        if (from < 0)   throw new IllegalArgumentException("Vertex names must be positive Integer");
        if (to < 0)     throw new IllegalArgumentException("Vertex names must be positive Integer");
        if (weight < 0) throw new IllegalArgumentException("Weight must be positive");
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public int from() {
        return from;
    }

    public int to() {
        return to;
    }

    public int weight() {
        return weight;
    }
}
