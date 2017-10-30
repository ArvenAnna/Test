package com.mainacad;


import java.util.Arrays;

public class SimpleQueue extends AbstractQueue implements Queue { /*Andrey Zhuravel comment: extends SimpleQueue from  AbstractQueue*/


    @Override
    public boolean remove() throws MyException {
        if (arrName.length<1){
            throw new MyException("Queue is empty. Nothing to remove.");
        }
        arrName[0] = null;
        for (int a = 1; a < arrName.length; a++) {
            arrName[a - 1] = arrName[a];
        }
        return false;
    }

    @Override
    public String toString() {
        return "SimpleQueue{" +
                "arrName=" + Arrays.toString(arrName) +
                '}';
    }
}

