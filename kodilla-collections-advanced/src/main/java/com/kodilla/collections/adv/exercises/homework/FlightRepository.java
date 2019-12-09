package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {
    static List<Flight> flightsList = new ArrayList<>();

    public void addFlight(Flight flight) {
        flightsList.add(flight);
    }

    public static List<Flight> getFlightsTable() {
        return flightsList;
    }

    public int size() {
        return flightsList.size();
    }
}