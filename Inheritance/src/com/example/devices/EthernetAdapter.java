package com.example.devices;

import com.example.common.Device;

public class EthernetAdapter extends Device {

    private int speed;
    private String mac;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public void getParameters() {
        System.out.println("speed");
        System.out.println("mac");

    }
}
