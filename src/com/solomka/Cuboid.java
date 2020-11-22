package com.solomka;

import com.solomka.points.Vertex3D;

public class Cuboid extends SpaceShape {
    private Vertex3D vertexA;
    private double width;
    private double height;
    private double depth;

    public Cuboid(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * height + height * depth + width * depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
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
        return "Cuboid" +
                "[" + this.vertexA +
                "], width=" + this.width +
                ", height=" + this.height +
                ", depth=" + this.depth +
                ", area="+ Math.ceil(this.getArea())+
                ", volume="+Math.ceil(this.getVolume());
    }
}
