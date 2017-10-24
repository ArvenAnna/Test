package src.com.mainacad;

import src.com.mainacad.Queue;

//too serious team
public class SimpleQueue implements Queue {
    public String[] getArrName() {
        return arrName;
    }

    private String[] arrName = new String[2];

    public int i = 0;

    /*
    * Sasha Zhurylo
    *  I add checking in method "add" ,
    *  which check if we wants to add String in cell array
    *  which does not exist we create new array with length * 2
    *
    * */
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
    public boolean remove() {

        arrName[0] = null;
        for (int a = 1; a < arrName.length; a++) {
            arrName[a - 1] = arrName[a];
        }

        return false;
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

