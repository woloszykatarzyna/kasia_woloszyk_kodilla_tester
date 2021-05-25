package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private int a;
    private int b;
    public Rectangle() {
        super ();
    }

    @Override
    public void area() {
        double result;
        this.a = 6;
        this.b = 4;
        result = a * b;
        System.out.println("Rectangle area: " +result);
    }

    @Override
    public void circumference() {
        double result;
        this.b = 4;
        this.a = 6;
        result = 2 * a + 2 * b;
        System.out.println("Rectangle circumference: " + result);
    }

}
