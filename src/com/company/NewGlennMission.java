package com.company;

public class NewGlennMission implements Flight{

    public NewGlennMission(FlightType flightType) {
        System.out.println("The New Glenn's the flight type is " + flightType);
    }

    @Override
    public void start() {
        System.out.println("The New Glenn's test flight successfully launched!");
    }

    @Override
    public void rocketType(Rocket rocket) {
        System.out.println("The New Glenn's rocket type is " + rocket);
    }

    @Override
    public void stop() {
        System.out.println("The New Glenn's test flight stopped!");
    }
}
