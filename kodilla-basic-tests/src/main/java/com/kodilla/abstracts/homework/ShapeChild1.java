package com.kodilla.abstracts.homework;


public class ShapeChild1 extends Shape {

    public ShapeChild1() {
        super (9);
    }

    @Override
    public void textCircle() {
        System.out.println("Oblicznie pola");
        System.out.println(circleArea());
    }
}