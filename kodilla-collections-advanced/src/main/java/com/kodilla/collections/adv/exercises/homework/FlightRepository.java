package com.kodilla.collections.adv.exercises.homework;


import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class FlightRepository {
//    public static List<List<String>> getFlightsTable() {
//        List<List<String>> loty = asList(
//
//        asList("Wrocław", "Lublin"),
//        asList("Wrocław", "Gdańsk"),
//        asList("Lublin", "Gdańsk"),
//        asList("Lublin", "Wrocław"));
//        return loty;
//    }

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Wrocław", "Lublin"));
        flights.add(new Flight("Wrocław", "Gdańsk"));
        flights.add(new Flight("Lublin",  "Wrocław"));
        flights.add(new Flight("Lublin",  "Gdańsk"));
        flights.add(new Flight("Gdańsk",  "Lublin"));
        flights.add(new Flight("Gdańsk", "Wrocław"));
        return flights;
    }
}
