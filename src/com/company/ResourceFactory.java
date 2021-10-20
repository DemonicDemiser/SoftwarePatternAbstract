package com.company;

public interface ResourceFactory {
    Flight createInstance(Flight.FlightType flightType);

    Rocket createRocket(int rocketCapacity);
}
