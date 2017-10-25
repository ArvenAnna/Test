package src.com.mainacad;

/**
 * Zhuravel Andrey: add abstract class AbstractQueue and add method reverseOrder
 */

/* Start comment Andrey Zhuravel*/
 /* End comment Andrey Zhuravel*/
abstract class AbstractQueue implements Queue {
    private int i = 0;
    protected String[] arrName = new String[2];

    void reverseOrder(String[] arrName) {

        for (int i = arrName.length - 1; i >= 0; i--) {

            System.out.println(arrName[i]);
        }
    }

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
