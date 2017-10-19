package com.example.common;

public class Device {

    private String manufacturer;
    private String serialnumber;
    private float price;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void getParameters() {
        System.out.println("manufacturer");
        System.out.println("serialnumber");
        System.out.println("price");
    }
}

