package com.kodilla.exception.test;

public class RouteFinderRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Wroclaw", "Warszawa");
        WroclawRouteChecker wroclawRouteChecker = new WroclawRouteChecker();
        try {
            if(wroclawRouteChecker.findFlight(flight)){
                System.out.println("There is a route");
            }
            else{
                System.out.println("There is no route");
            }
        }
        catch (RouteNotFoundException e){
            System.out.println("Could not find destination airport");
        }
    }
}
