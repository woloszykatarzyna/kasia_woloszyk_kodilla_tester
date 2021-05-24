package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle() {
        super (0, 4, 8, 3, 9);
    }

    @Override
    public void area() {
        double result;
        int a = getA();
        int h = getH();
        result = 0.5 * a * h;
        System.out.println("Triangle area: " + result);
    }

    @Override
    public void circumference() {
        double result;
        int a = getA();
        int b = getB();
        int c = getC();
        result = a + b + c;
        System.out.println("Triangle circumference: " + result);
    }
}