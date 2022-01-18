package com.fahim.bridge;

public class SamsungTv implements Device {

    @Override
    public void turnOn() {
        System.out.println("Samsung : turnOn");

    }

    @Override
    public void turnOff() {
        System.out.println("Samsung : turnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Samsung : set channel" + number);

    }
}
