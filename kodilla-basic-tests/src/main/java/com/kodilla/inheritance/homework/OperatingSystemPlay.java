package com.kodilla.inheritance.homework;

public class OperatingSystemPlay {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2000);
        operatingSystem.turnOn();

        OperatingSystemChild operatingSystemChild = new OperatingSystemChild(1999);
        operatingSystemChild.turnOn();

        OperatingSystemChild2 operatingSystemChild2 = new OperatingSystemChild2(1998);
        operatingSystemChild2.turnOff();
        }

    }
