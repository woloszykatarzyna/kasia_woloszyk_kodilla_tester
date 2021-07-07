package com.kodilla.collections.adv.exercises.homework;

import java.util.*;
import java.util.stream.Collectors;

public class FlightFinder {
//    List<List<String>> loty = FlightRepository.getFlightsTable();

//        public List<Flight> findFlightsFrom(String departure){
//            return loty.getOrDefault(departure, Collections.emptyList());
//        }
//
//        public List<Flight> findFlightsTo(String arrival) {
//
//            return loty.getOrDefault(arrival, Collections.emptyList());
//        }

    public List<Flight> findFlightsFrom (String departure){
        List<String> departures = FlightRepository.getFlightsTable()
                .stream()
                .filter(u -> u.getDeparture().equals(departure))
                .map(FlightFinder::getDepartureTown)
                .collect(Collectors.toList());
        return departures.getOrDefault(departure, Collections.emptyList());;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<String> arrivals = FlightRepository.getFlightsTable()
                .stream()
                .filter(u -> u.getArrival().equals(arrival))
                .map(FlightFinder::getArrivalTown)
                .collect(Collectors.toList());
        return arrivals.getOrDefault(arrival, Collections.emptyList());
    }
    public static String getDepartureTown (Flight flight){
        return flight.getDeparture();
    }
    public static String getArrivalTown (Flight flight){
        return flight.getDeparture();
    }
}
