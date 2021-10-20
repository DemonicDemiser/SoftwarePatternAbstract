package com.company;

public class SpaceShipMission implements Flight{

    public SpaceShipMission(FlightType flightType) {
        System.out.println("The SpaceShip mission's the flight type is on" + flightType);
    }

    @Override
    public void start() {
        System.out.println("The SpaceShip mission's test flight successfully launched!");
    }

    @Override
    public void rocketType(Rocket rocket) {
        System.out.println("The SpaceShip mission's rocket type is " + rocket);
    }

    @Override
    public void stop() {
        System.out.println("The SpaceShip mission's test flight stopped!");
    }
}
