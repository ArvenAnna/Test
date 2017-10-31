package com.mainacad;

import java.util.Arrays;
import java.util.Random;

/**
 * Sasha Z. and Andrey Z.: Add abstract class AbstractQueue
 * Andrey Z.: Add method reverseOrder
 */

abstract class AbstractQueue implements Queue {
    private int i = 0;
    protected String[] arrName = new String[12];

    /* Start comment Andrey Zhuravel*/
    public void reverseOrder() {

        int a = arrName.length;
        String[] reverse = new String[a];
        for (int i = arrName.length - 1; i >= 0; i--) {
            reverse[i] = arrName[a - i - 1];

        }
    }
    /* End comment Andrey Zhuravel*/

    /* Alexey Syrovatko */
    @Override
    public void removeAll() {
        for (int i = 0; i < arrName.length; i++){
            arrName[i] = null;
        }
    }
    /* Alexey Syrovatko */

    @Override
    public boolean add(String name) {
        if (i == arrName.length) {
            String arrNameCopy[] = arrName;
            arrName = new String[arrNameCopy.length * 2];
            for (int j = 0; j < arrNameCopy.length; j++) {
                arrName[j] = arrNameCopy[j];
            }
            arrName[i] = name;
            i++;
        } else {
            arrName[i] = name;
            i++;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return arrName[0] == null;

    }

    @Override
    public String element() {
        return arrName[0];
    }


    @Override
    public  void shuffle() {
        int index;
        String temp;
        Random random = new Random();
        for (int i = arrName.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = arrName[index];
            arrName[index] = arrName[i];
            arrName[i] = temp;
        }
    }
}
