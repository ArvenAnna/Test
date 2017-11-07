package com.example.testpack;

/*
This is a testing class Main:
Using it, we can create an array with a couple of devices and reading
all parameters that we send to constructor and invoke getDeviceParameters
from super class (Device Class) and from subclass (Monitor or EthernetAdapter classes).

 */

import com.example.common.Device;
import com.example.devices.EthernetAdapter;
import com.example.devices.Monitor;

public class Main {

    public static void main(String[] args) {

//      Example 1:
//      Monitor monitor1 = new Monitor("Samsung",450.0f,"122-133",1024,768);
//      Monitor monitor2 = new Monitor("NEC",470.0f,"133-577",1050,880);
//      Device[] arr = {monitor1, monitor2};

//      Example 2:
//      EthernetAdapter ethernetAdapter1 = new EthernetAdapter("Intel", 130.0f, "123456", 256,"04-5A-6C-93-1D-5G");
//      EthernetAdapter ethernetAdapter2 = new EthernetAdapter("Bosch", 250.0f, "400500", 128,"0D-5B-7Y-97-2Y-5Z");
//      Device[] arr = {ethernetAdapter1, ethernetAdapter2};

        Monitor monitor1 = new Monitor("Samsung", 450.0f, "122-133", 1024, 768);
        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("Intel", 130.0f, "123456", 256, "04-5A-6C-93-1D-5G");

        Device[] arr = {monitor1, ethernetAdapter1};

        for (int i = 0; i < arr.length; i++) {
            arr[i].getDeviceParameters();
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

