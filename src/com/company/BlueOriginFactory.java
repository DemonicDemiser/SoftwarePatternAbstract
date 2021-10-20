package com.company;

public class BlueOriginFactory implements ResourceFactory{
    @Override
    public Flight createInstance(Flight.FlightType flightType) {
        return new NewGlennMission(flightType);
    }

    @Override
    public Rocket createRocket(int rocketCapacity) {
        return new BlueMoonRocket(rocketCapacity);
    }
}
