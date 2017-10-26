package com.mainacad;

import java.util.Arrays;

public class SimpleStack extends AbstractQueue implements Queue {

    @Override
    public boolean remove() {
        for (int j = arrName.length - 1; j > 0; j--) {
            if (arrName[j] != null) {
                arrName[j] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "SimpleStack{" +
                "arrName=" + Arrays.toString(arrName) +
                '}';
    }
}
