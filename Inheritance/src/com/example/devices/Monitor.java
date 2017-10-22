package com.example.devices;

import com.example.common.Device;

public class Monitor extends Device {
    //Alexey Syrovatko
    private int resolutionX;
    private int getResolutionY;

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getGetResolutionY() {
        return getResolutionY;
    }

    public void setGetResolutionY(int getResolutionY) {
        this.getResolutionY = getResolutionY;
    }
    //Alexey Syrovatko

    public void getParameters() {
        System.out.println("resolutionX");
        System.out.println("resolutionY");
    }
}
