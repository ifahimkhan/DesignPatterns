package com.fahim.bridge;

public class AdvancedRemoteControl extends RemoteControl {
    private Device device;

    public AdvancedRemoteControl(Device device) {

        super(device);
        this.device = device;
    }

    public void setChannel(int number){
        device.setChannel(number);
    }
}
