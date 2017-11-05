package com.example.devices;

/*
This class Create a Monitor and using a super constructor from Device class with
manufacturer, price and serialnumber parameters and individual parameters for Monitor.
 */

import com.example.common.Device;

public class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }


    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }


    public void getMonitorParameters() {
        System.out.println(("ResolutionX is a:") + this.getResolutionX());
        System.out.println(("ResolutionY is a:") + this.getResolutionY());
        ;
    }

    public void getDeviceParameters() {
        super.getDeviceParameters();
        this.getMonitorParameters();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}
