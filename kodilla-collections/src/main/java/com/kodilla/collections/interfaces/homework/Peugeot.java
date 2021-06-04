package com.kodilla.collections.interfaces.homework;

public class Peugeot implements Car {
    private int v;
    int speed;

    public Peugeot(int speed) {
        this.v = speed;
    }

    public int getSpeed() {
        return v;
    }

    public void increaseSpeed() {
        v += 20;
    }

    public void decreaseSpeed() {
        v -= 20;
    }
}