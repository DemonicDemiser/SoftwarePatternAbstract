package com.company;

public interface Flight {
    enum FlightType {earthOrbit, moonOrbit, marsOrbit}

    void start();

    void rocketType(Rocket rocket);

    void stop();

}
