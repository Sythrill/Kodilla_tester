package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getListOfAiports() {
        Map<String, Boolean> aiports = new HashMap<>();
        aiports.put("Miami", true);
        aiports.put("Malta", true);
        aiports.put("LasPalmas", false);
        aiports.put("Warsaw", true);
        return aiports;
    }

    public boolean isAirportInUse(String aiport) throws AirportNotFoundException {
        if (getListOfAiports().containsKey(aiport))
            return getListOfAiports().get(aiport);
        throw new AirportNotFoundException();
    }
}