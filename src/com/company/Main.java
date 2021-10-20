package com.company;

public class Main {

    public static void main(String[] args) {
        ResourceFactory factory = new BlueOriginFactory();

        Flight flight = factory.createInstance(Flight.FlightType.earthOrbit);
        Rocket rocket = factory.createRocket(2000);
        flight.rocketType(rocket);

        flight.start();
        flight.stop();
    }
}
