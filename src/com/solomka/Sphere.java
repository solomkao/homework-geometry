package com.solomka;

import com.solomka.points.Vertex3D;

public class Sphere extends SpaceShape {
    private Vertex3D vertexA;
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    @Override
    public void addVertex(double... x) {
        if (x != null && x.length == 3) {
            this.vertexA = new Vertex3D(x[0], x[1], x[2]);
            super.list.add(vertexA);
        }
    }

    @Override
    public String toString() {
        return "Sphere " +
                "[" + vertexA +
                "], radius=" + radius +
                ", area=" + Math.ceil(this.getArea()) +
                ", volume=" + Math.ceil(this.getVolume());
    }
}
