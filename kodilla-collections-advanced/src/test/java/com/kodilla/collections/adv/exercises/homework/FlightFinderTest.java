package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {
    FlightRepository flightRepository = new FlightRepository();
    FlightFinder flightFinder = new FlightFinder();

    @Test
    public void testAddFlight() {
        String aiport = "Warszawa";
        Flight flight = new Flight("Warszawa", "Kraków");
        flightRepository.addFlight(flight);
        assertEquals(1, flightRepository.size());
    }

    @Test
    public void testFindFlightsFrom() {
        flightRepository.addFlight( new Flight("Warszawa", "Krakow"));
        flightRepository.addFlight( new Flight("Warszawa", "Poznan"));
        flightRepository.addFlight(new Flight("Krakow", "Gdansk"));
        flightRepository.addFlight( new Flight("Krakow", "Poznan"));
        flightRepository.addFlight( new Flight("Gdansk", "Poznan"));

        List<Flight> result = flightFinder.findFlightsFrom("Poznan");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warszawa", "Poznan"));
        expectedList.add(new Flight("Krakow", "Poznan"));
        expectedList.add(new Flight("Gdansk", "Poznan"));

        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        flightRepository.addFlight( new Flight("Warszawa", "Krakow"));
        flightRepository.addFlight( new Flight("Warszawa", "Poznan"));
        flightRepository.addFlight(new Flight("Poznan", "Gdansk"));
        flightRepository.addFlight( new Flight("Krakow", "Poznan"));
        flightRepository.addFlight( new Flight("Gdansk", "Poznan"));

        List<Flight> result = flightFinder.findFlightsTo("Poznan");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Poznan", "Gdansk"));

        assertEquals(expectedList, result);
    }
}