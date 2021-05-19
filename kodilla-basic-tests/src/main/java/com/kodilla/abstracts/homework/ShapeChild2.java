package com.kodilla.abstracts.homework;

public class ShapeChild2 extends Shape {

    public ShapeChild2() {
        super (8);
    }

    @Override
    public void textCircle() {
        System.out.println("Oblicznie obwodu");
        System.out.println(circleCircumference());
    }
}
