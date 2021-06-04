package com.kodilla.collections.interfaces.homework;

public class Tesla implements Car {
    private int v;

    public Tesla(int speed) {
        this.v = speed;
    }

    public int getSpeed() {
        return v;
    }

    public void increaseSpeed() {
        v += 10;
    }

    public void decreaseSpeed() {
        v -= 10;
    }
}