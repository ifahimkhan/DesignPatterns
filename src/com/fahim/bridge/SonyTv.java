package com.fahim.bridge;

public class SonyTv implements Device {

    @Override
    public void turnOn() {
        System.out.println("Sony : turnOn");

    }

    @Override
    public void turnOff() {
        System.out.println("Sony : turnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony : set channel" + number);

    }
}
