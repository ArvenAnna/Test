package com.mainacad;

import java.util.Arrays;

public class SimpleStack extends AbstractQueue implements Queue {

    @Override
    public boolean remove() throws MyException {
        if (arrName.length<1){
            throw new MyException("Queue is empty.Nothing to remove.");
        }
        for (int j = arrName.length - 1; j > 0; j--) {
            if (arrName[j] != null) {
                arrName[j] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String element() {
        for (int i = arrName.length - 1; i > 0; i--) {
            if (arrName[i] != null) {
                System.out.println(arrName[i]);
                break;
            }
        }
        return "";
    }



    @Override
    public String toString() {
        return "SimpleStack{" +
                "arrName=" + Arrays.toString(arrName) +
                '}';
    }

}
