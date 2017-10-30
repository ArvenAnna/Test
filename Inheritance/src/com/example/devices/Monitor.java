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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return getResolutionY == monitor.getResolutionY;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + getResolutionY;
        return result;
    }
}
