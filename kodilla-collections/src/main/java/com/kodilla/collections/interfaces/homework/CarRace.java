package com.kodilla.collections.interfaces.homework;


public class CarRace {
    public static void main(String[] args) {
        Toyota toyota = new Toyota(100);
        doRace(toyota);

        Peugeot peugeot = new Peugeot(90);
        doRace(peugeot);

        Tesla tesla = new Tesla(80);
        doRace(tesla);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
