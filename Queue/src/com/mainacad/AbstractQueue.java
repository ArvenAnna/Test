package src.com.mainacad;

/**
 * Sasha Z. and Andrey Z.: Add abstract class AbstractQueue
 * Andrey Z.: Add method reverseOrder
 */

abstract class AbstractQueue implements Queue {
    private int i = 0;
    protected String[] arrName = new String[2];

    /* Start comment Andrey Zhuravel*/
    void reverseOrder() {

        for (int i = arrName.length - 1; i >= 0; i--) {

            System.out.println(arrName[i]);
        }
    }
    /* End comment Andrey Zhuravel*/

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
