package com.kodilla.inheritance.homework;

public class OperatingSystemChild2 extends OperatingSystem{
    public OperatingSystemChild2(int year) {
        super(year);
    }

    @Override
    public void turnOff() {
        System.out.println("Operating system should be turned off");
    }
}
