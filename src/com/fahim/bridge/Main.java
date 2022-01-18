package com.fahim.bridge;

public class Main {
    public static void main(String[] args) {
        var remoteControl=new RemoteControl(new SonyTv());
        remoteControl.turnOn();
        remoteControl.turnOff();

        var remoteControl1=new AdvancedRemoteControl(new SamsungTv());
        remoteControl1.turnOn();
        remoteControl1.setChannel(5);
        remoteControl1.turnOff();

    }
}
