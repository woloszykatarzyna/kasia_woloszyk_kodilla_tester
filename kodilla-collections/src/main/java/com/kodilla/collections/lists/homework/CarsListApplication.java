package com.kodilla.collections.lists.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Peugeot;
import com.kodilla.collections.interfaces.homework.Tesla;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Tesla tesla = new Tesla(120);
        cars.add(tesla);
        cars.add(new Toyota(100));
        cars.add(new Tesla(110));
        cars.add(new Peugeot(120));


        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(3);
        cars.remove(tesla);

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
