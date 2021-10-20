package com.company;

public class SpaceShipTwoRocket implements Rocket{

    public SpaceShipTwoRocket(int rocketCapacity) {
        System.out.println("SpaceShipTwo with rocket type " + rocketCapacity + " .");
    }

    @Override
    public String getId() {
        return "SpaceShipTwo Rocket";
    }

    @Override
    public String toString() {
        return "SpaceShipTwoRocket";
    }
}
