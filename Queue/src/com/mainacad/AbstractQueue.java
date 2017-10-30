package com.mainacad;

import java.util.Random;    // Vadym

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


    /* Start comment Vadym */
    @Override
    public String shuffle() {
//        int length = arrName.length;
//        for (int i = 0; i < length; i++) {
//            String rnd = String.valueOf(Math.random() * length);
//            String tmp = arrName[i];
//            arrName[i] = arrName[rnd];
//            arrName[rnd] = Arrays.tmp;
//        }
//    }

//    static void shuffleArray(int[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

//        ArrayList<Integer> x = new ArrayList<Integer>();
//        for (int i = 1; i <= shuf.length(); i++) {
//            x.shuf(i);
//        }
//        Collections.shuffle(x);
//    }

    /* End comment Vadym */


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

}
