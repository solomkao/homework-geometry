package com.solomka;

import com.solomka.points.Vertex;

public class Circle extends PlaneShape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*radius*2;
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
        return "Circle " +
                "[" + super.list.get(0) +
                "], radius="+this.radius+
                ", perimeter="+Math.ceil(this.getPerimeter())+
                ", area="+Math.ceil(this.getArea());
    }
}
