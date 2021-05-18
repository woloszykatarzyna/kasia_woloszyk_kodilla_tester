package com.kodilla.inheritance.homework;

public class OperatingSystemChild extends OperatingSystem{
    public OperatingSystemChild(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Operating system should be turned on");
    }
}
