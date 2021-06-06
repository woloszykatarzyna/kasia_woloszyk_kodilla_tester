package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Peugeot;
import com.kodilla.collections.interfaces.homework.Tesla;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Toyota(100));
        cars.add(new Tesla(110));
        cars.add(new Peugeot(120));

        for (Car car : cars) {
            System.out.println(car + ", speed: " + car.getSpeed());
        }
    }
}
