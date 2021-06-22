package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.Dictionary;
import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightFrom() {
        FlightFinder loty = FlightRepository.getFlightsTable();
;
        List<Flight> result = loty.findFlightsFrom("Wrocław");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Wrocław", "Lublin"));
        expectedList.add(new Flight("Wrocław", "Gdańsk"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightTo() {
        FlightFinder loty = FlightRepository.getFlightsTable();

        List<Flight> result = loty.findFlightsTo("Wrocław");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Wrocław", "Lublin"));
        expectedList.add(new Flight("Wrocław", "Gdańsk"));
        assertEquals(expectedList, result);
    }
}