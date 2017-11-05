package com.example.devices;

/*
This class Create a EthernetAdapter and using a super constructor from Device class with
manufacturer, price and serialnumber parameters and individual parameters for EthernetAdapter.
 */

import com.example.common.Device;

public class EthernetAdapter extends Device {

    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

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

    public void getEthernetAdapterParameters() {
        System.out.println(("EthernetAdapter Mac is a:") + this.getSpeed());
        System.out.println(("EthernetAdapter Speed is a") + this.getMac());
    }

    public void getDeviceParameters() {
        super.getDeviceParameters();
        this.getEthernetAdapterParameters();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (speed != that.speed) return false;
        return mac != null ? mac.equals(that.mac) : that.mac == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + speed;
        result = 31 * result + (mac != null ? mac.hashCode() : 0);
        return result;
    }
}
