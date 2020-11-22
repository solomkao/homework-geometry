package com.solomka;

import com.solomka.points.Vertex;

public class Rectangle extends PlaneShape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public void addVertex(double ...d) {
        if (d != null && d.length == 2) {
            Vertex vertex = new Vertex(d[0], d[1]);
            super.list.add(vertex);
        }
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "[" + super.list.get(0) +
                "], perimeter=" + Math.ceil(this.getPerimeter()) +
                ", area=" + Math.ceil(this.getArea());
    }
}
