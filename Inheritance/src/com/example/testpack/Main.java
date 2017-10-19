package com.example.testpack;

import com.example.common.Device;
import com.example.devices.EthernetAdapter;
import com.example.devices.Monitor;

public class Main {

    public static void main(String[] args) {

        Device device = new Device();
        device.getParameters();

        Monitor monitor = new Monitor();
        EthernetAdapter ethernetAdapter = new EthernetAdapter();

        Device [] arr = {monitor, ethernetAdapter};

        for (int i=0; i <arr.length; i++) {
            arr[i].getParameters();
        }
    }
}

