package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flightsList = new ArrayList<>();
        flightsList.add(new Flight("Warszawa", "Krakow"));
        flightsList.add(new Flight("Warszawa", "Poznan"));
        flightsList.add(new Flight("Poznan", "Gdansk"));
        flightsList.add(new Flight("Krakow", "Poznan"));
        flightsList.add(new Flight("Gdansk", "Poznan"));
        return flightsList;
    }
}

