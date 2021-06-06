package com.kodilla.collections.interfaces;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }
}
