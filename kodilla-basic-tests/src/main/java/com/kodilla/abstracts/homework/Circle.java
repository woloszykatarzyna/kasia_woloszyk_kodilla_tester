package com.kodilla.abstracts.homework;


public class Circle extends Shape {

    public Circle() {
        super (9, 0,0 ,0 ,0);
    }

    @Override
    public void area() {
        double result;
        double r = getR();
        result = PI * r * r;
        System.out.println("Circle area: " +result);
    }

    @Override
    public void circumference() {
        double result;
        double r = getR();
        result = 2 * PI * r;
        System.out.println("Circumference of a circle: " + result);
    }
}