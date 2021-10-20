package com.company;

public class VirginGalacticFactory implements ResourceFactory{
    @Override
    public Flight createInstance(Flight.FlightType flightType) {
        return new SpaceShipMission(flightType);
    }

    @Override
    public Rocket createRocket(int rocketCapacity) {
        return new SpaceShipTwoRocket(rocketCapacity);
    }
}
