package com.solomka.points;

public class Vertex {
    protected double x;
    protected double y;

    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }
}
