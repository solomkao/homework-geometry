package com.solomka;

import com.solomka.points.Vertex;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    protected List<Vertex> list = new ArrayList<>();

    public abstract void addVertex(double... x);

}
