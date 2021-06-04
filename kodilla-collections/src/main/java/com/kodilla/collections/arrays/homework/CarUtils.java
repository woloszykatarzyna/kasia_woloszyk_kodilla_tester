package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Peugeot;
import com.kodilla.collections.interfaces.homework.Tesla;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Peugeot)
            return "Peugeot";
        else if (car instanceof Tesla)
            return "Tesla";
        else
            return "Unknown car name";
    }

}
