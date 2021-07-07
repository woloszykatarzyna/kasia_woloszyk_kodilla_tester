package com.kodilla.collections.adv.exercises.homework;


import java.util.List;

import static java.util.Arrays.asList;

public class FlightRepository {
    public static List<List<String>> getFlightsTable() {
        List<List<String>> loty = asList(

        asList("Wrocław", "Lublin"),
        asList("Wrocław", "Gdańsk"),
        asList("Lublin", "Gdańsk"),
        asList("Lublin", "Wrocław"));
        return loty;
    }
}
