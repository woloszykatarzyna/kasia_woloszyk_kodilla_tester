package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    static final double PI = 3.1415927;
   private int r;

    public Circle() {
        super ();
    }

    @Override
    public void area() {
        double result;
        this.r = 9;
        result = PI * r * r;
        System.out.println("Circle area: " +result);
    }

    @Override
    public void circumference() {
        double result;
        this.r = 9;
        result = 2 * PI * r;
        System.out.println("Circumference of a circle: " + result);
    }
}