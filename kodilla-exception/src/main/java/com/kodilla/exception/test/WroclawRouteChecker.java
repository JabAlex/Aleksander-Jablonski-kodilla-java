package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class WroclawRouteChecker {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warszawa", true);
        flightMap.put("Krakow", true);
        flightMap.put("Poznan", true);
        flightMap.put("Torun", false);
        if(flightMap.containsKey(flight.getArrivalAirport())) {
            return flightMap.get(flight.getArrivalAirport());
        }
        else{
            throw new RouteNotFoundException("Could not find airport");
        }
    }
}
