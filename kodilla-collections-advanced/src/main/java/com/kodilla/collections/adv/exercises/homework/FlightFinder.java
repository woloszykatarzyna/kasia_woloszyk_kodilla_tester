package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {
    Map<String, List<Flight>> loty = new HashMap<>();

    public void addFlight(String departure, Flight arrival) {
        List<Flight> flights = loty.getOrDefault(departure, new ArrayList<>());
        flights.add(arrival);
        loty.put(departure, flights);
    }

    public List<Flight> findFlightsFrom(String departure){
        return loty.getOrDefault(departure, Collections.emptyList());
    }

    public List<Flight> findFlightsTo(String arrival) {
        return loty.getOrDefault(arrival, Collections.emptyList());
    }
}
