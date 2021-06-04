package com.kodilla.collections.interfaces;

public class Circle implements Shape{
    private double r;

    public Circle(double radius) {
        this.r = radius;
    }

    public double getArea() {
        return r * r * Math.PI;
    }

    public double getPerimeter() {
        return 2 * r * Math.PI;
    }
}
