package com.kodilla.abstracts.homework;

public abstract class Shape {

    static final double PI = 3.1415927;
    private double r;
    private int a;
    private int b;
    private int h;
    private int c;

    public Shape(double r, int a, int b, int h, int c) {
        this.a = a;
        this.r = r;
        this.b = b;
        this.h = h;
        this.c = c;
    }

    public double getR() {
        return r;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getH() {
        return h;
    }
    public int getC() {
        return c;
    }

    public abstract void area();

    public abstract void circumference();
}
