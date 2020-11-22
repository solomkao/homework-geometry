package com.solomka;

import com.solomka.points.Vertex;

public class Triangle extends PlaneShape {

    @Override
    public double getArea() {
        if (super.list.size() >= 3) {
            Vertex vertexA = super.list.get(0);
            Vertex vertexB = super.list.get(1);
            Vertex vertexC = super.list.get(2);
            double ab = getDistance(vertexA, vertexB);
            double ac = getDistance(vertexA, vertexC);
            double bc = getDistance(vertexB, vertexC);
            double p = (ab + ac + bc) / 2.0;
            return Math.sqrt((p * (p - ab) * (p - ac) * (p - bc)));
        } else {
            return -1;
        }
    }

    @Override
    public double getPerimeter() {
        if (super.list.size() >= 3) {
            Vertex vertexA = super.list.get(0);
            Vertex vertexB = super.list.get(1);
            Vertex vertexC = super.list.get(2);
            double ab = getDistance(vertexA, vertexB);
            double ac = getDistance(vertexA, vertexC);
            double bc = getDistance(vertexB, vertexC);
            return ab + ac + bc;
        } else {
            return -1;
        }
    }

    private double getDistance(Vertex v1, Vertex v2) {
        return Math.sqrt(Math.pow((v2.getX() - v1.getX()), 2) + Math.pow((v2.getY() - v1.getY()), 2));
    }

    @Override
    public void addVertex(double... d) {
        if (d != null && d.length == 6) {
            this.list.add(new Vertex(d[0], d[1]));
            this.list.add(new Vertex(d[2], d[3]));
            this.list.add(new Vertex(d[4], d[5]));
        }
    }

    @Override
    public String toString() {
        return "Triangle " +
                "[A " + super.list.get(0) +
                ", B " + super.list.get(1) +
                ", C " + super.list.get(2) +
                "], perimeter=" + Math.ceil(this.getPerimeter()) + ", area=" + Math.ceil(this.getArea());
    }

}
