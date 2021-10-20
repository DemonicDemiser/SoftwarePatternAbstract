package com.company;

public class BlueMoonRocket implements Rocket{

    public BlueMoonRocket(int rocketType) {
        System.out.println("BlueOrigin with rocket type " + rocketType + ".");
    }

    @Override
    public String getId() {
        return "BlueMoon Rocket";
    }

    @Override
    public String toString() {
        return "BlueMoonRocket";
    }
}
