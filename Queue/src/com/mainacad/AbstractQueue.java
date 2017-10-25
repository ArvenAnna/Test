package src.com.mainacad;

/**
 * Zhuravel Andrey: add abstract class AbstractQueue and add method reverseOrder
 */

/* Start comment Andrey Zhuravel*/
abstract class AbstractQueue {

    void reverseOrder (String [] arrName) {

        for (int i = arrName.length - 1; i >= 0; i--) {

            System.out.println(arrName[i]);
        }
    }
    /* End comment Andrey Zhuravel*/
}
