package com.solomka;

import com.solomka.points.Vertex3D;

public class SquarePyramid extends SpaceShape {
    private Vertex3D vertexCentre;
    private double width;
    private double height;

    public SquarePyramid(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width / 2 * Math.sqrt(height * height - width * width / 4);
    }

    @Override
    public double getVolume() {
        return (width * width * height) / 3;
    }

    @Override
    public void addVertex(double... x) {
        if (x != null && x.length == 3) {
            this.vertexCentre = new Vertex3D(x[0], x[1], x[2]);
            super.list.add(vertexCentre);
        }
    }

    @Override
    public String toString() {
        return "Square Pyramid " +
                "[" + this.vertexCentre +
                "], width=" + this.width +
                ", height=" + this.height +
                ", area="+ Math.ceil(this.getArea())+
                ", volume="+Math.ceil(this.getVolume());
    }
}
