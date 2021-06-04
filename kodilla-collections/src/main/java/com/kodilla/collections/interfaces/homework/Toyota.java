package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car{


    private int v;

    public Toyota(int speed) {
        this.v = speed;
    }

    public int getSpeed() {
        return v;
    }

    public void increaseSpeed() {
        v+= 30;
    }

    public void decreaseSpeed() {
        v -= 30;
    }
}
