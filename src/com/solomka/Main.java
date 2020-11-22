package com.solomka;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.addVertex(1.2, 5, 7, 8, 4, 6);
        Shape rectangle = new Rectangle(2.0, 8.1);
        rectangle.addVertex(2, 5);
        Shape circle = new Circle(8.5);
        circle.addVertex(8, 48);
        Shape cuboid = new Cuboid(7, 5, 8.9);
        cuboid.addVertex(8.7, 9, 1);
        Shape sphere = new Sphere(75);
        sphere.addVertex(1, 5, 7);
        Shape sqPyramid = new SquarePyramid(7, 8);
        sqPyramid.addVertex(7.3, 4, 8);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(rectangle);
        shapes.add(circle);
        shapes.add(cuboid);
        shapes.add(sphere);
        shapes.add(sqPyramid);
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}
