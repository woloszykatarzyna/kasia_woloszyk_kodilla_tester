package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle() {
        super (0,5, 8, 0, 0);
    }

    @Override
    public void area() {
        double result;
        int a = getA();
        int b = getB();
        result = a * b;
        System.out.println("Rectangle area: " +result);
    }

    @Override
    public void circumference() {
        double result;
        int a = getA();
        int b = getB();
        result = 2 * a + 2 * b;
        System.out.println("Rectangle circumference: " + result);
    }

}
