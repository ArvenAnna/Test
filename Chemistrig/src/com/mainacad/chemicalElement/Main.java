import chemicalElement.ChemicalElement;
import chemicalElement.ComparatorRlectroNegatinity;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ChemicalElement object = new ChemicalElement();
        ChemicalElement object2 = new ChemicalElement();
        ChemicalElement object3 = new ChemicalElement();
        ChemicalElement[] arr = {object, object2, object3};

        Arrays.sort(arr, new ComparatorRlectroNegatinity());
        Arrays.sort(arr, new Comparator<ChemicalElement>() {
            @Override
            public int compare(ChemicalElement o1, ChemicalElement o2) {
                throw new UnsupportedOperationException();
            }
        });
    }
}
