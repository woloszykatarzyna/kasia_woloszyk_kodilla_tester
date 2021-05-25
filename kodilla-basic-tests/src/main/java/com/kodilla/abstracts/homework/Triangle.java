package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private int a;
    private int h;
    private int b;
    private int c;

public Triangle() {
        super ();
    }

    @Override
    public void area() {
        double result;
        this.a = 5;
        this.h = 6;
        result = 0.5 * a * h;
        System.out.println("Triangle area: " + result);
    }

    @Override
    public void circumference() {
        double result;
        this.a = 5;
        this.b = 2;
        this.c = 6;
        result = a + b + c;
        System.out.println("Triangle circumference: " + result);
    }
}