package com.kodilla.abstracts.homework;

public class ApplicationShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();
        circle.circumference();

        Rectangle rectangle = new Rectangle();
        rectangle.area();
        rectangle.circumference();

        Triangle triangle = new Triangle();
        triangle.area();
        triangle.circumference();

    }
}
