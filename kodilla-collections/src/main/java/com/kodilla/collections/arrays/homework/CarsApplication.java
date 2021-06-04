package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Peugeot;
import com.kodilla.collections.interfaces.homework.Tesla;


import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }


    private static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int a = random.nextInt(20) + 50;
        int b = random.nextInt(40) + 50;
        int c = random.nextInt(60) + 50;
        if (drawnCarKind == 0)
            return new Toyota(a);
        else if (drawnCarKind == 1)
            return new Peugeot(b);
        else
            return new Tesla(c);
    }
}

