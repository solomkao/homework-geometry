package com.solomka.points;

public class Vertex3D extends Vertex {
    private double z;

    public Vertex3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "x=" + super.x + ", y=" + super.y +
                ", z=" + this.z;
    }
}
