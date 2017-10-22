package com.example.common;

public class Device {

    //Alexey Syrovatko
    private String manufacturer;
    private float price;
    private String serialNumber;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    //Alexey Syrovatko

    public void getParameters() {
        System.out.println("manufacturer");
        System.out.println("serialnumber");
        System.out.println("price");
    }
}

