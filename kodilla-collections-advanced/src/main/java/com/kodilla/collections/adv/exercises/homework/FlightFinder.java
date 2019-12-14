package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();

        for (Flight flight : FlightRepository.getFlightsTable()){
            if (flight.getDeparture().equals(departure))
                result.add(flight);
        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight :  FlightRepository.getFlightsTable()){
            if (flight.getArrival().equals(arrival))
            result.add(flight);
        }
        return result;
    }

    public List<Flight> findFlightsTo2(String arrival) {
        List<Flight> result = FlightRepository.getFlightsTable()
                .stream()
                .filter(f -> f.getArrival().equals(arrival))
                .map(f ->  new Flight(f.getArrival(),f.getDeparture()))
                .collect(Collectors.toList());
        return result;
        }
}