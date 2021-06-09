package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("No", "Polska", 1.5, 2.5));
        stamps.add(new Stamp("Yes", "Francja", 2.0, 1.0));
        stamps.add(new Stamp("No", "Włochy", 2.0, 3.0));
        stamps.add(new Stamp("Yes", "Niemcy", 2.0, 2.0));
        stamps.add(new Stamp("Yes", "Niemcy", 2.0, 2.0));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
