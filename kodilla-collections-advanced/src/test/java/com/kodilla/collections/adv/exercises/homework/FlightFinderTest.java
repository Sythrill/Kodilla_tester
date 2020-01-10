package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {
    private FlightFinder flightFinder = new FlightFinder();
    @Test
    public void testFindFlightsFrom() {
        List<Flight> result = flightFinder.findFlightsFrom("Poznan");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warszawa", "Poznan"));
        expectedList.add(new Flight("Krakow", "Poznan"));
        expectedList.add(new Flight("Gdansk", "Poznan"));

        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        List<Flight> result = flightFinder.findFlightsTo("Poznan");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Poznan", "Gdansk"));

        assertEquals(expectedList, result);
    }

    @Test
    public void findFlightsTo2() {
        List<Flight> result = flightFinder.findFlightsTo2("Poznan");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Poznan", "Gdansk"));

        assertEquals(expectedList, result);
    }
}