package src.com.mainacad;
/*
* Sasha Zhurylo
* I create new class which execute condition first input last output
*/
public class SimpleStack implements Queue {

    private String[] arrName = new String[4];

    public int i = 0;

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
        for (int j = arrName.length - 1; j > 0; j--) {
            if (arrName[j] != null) {
                arrName[j] = null;
                return true;
            }
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

    public String[] getArrName() {
        return arrName;
    }
}
