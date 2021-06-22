package com.kodilla.collections.adv.exercises.homework;


public class FlightRepository {
    public static FlightFinder getFlightsTable() {
        FlightFinder loty = new FlightFinder();
        loty.addFlight("Wrocław", new Flight("Wrocław", "Lublin"));
        loty.addFlight("Wrocław", new Flight("Wrocław", "Gdańsk"));
        loty.addFlight("Lublin", new Flight("Lublin", "Gdańsk"));
        loty.addFlight("Lublin", new Flight("Lublin", "Wrocław"));
        return loty;
    }
}
