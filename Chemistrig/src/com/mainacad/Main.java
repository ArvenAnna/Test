package com.mainacad;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import static com.mainacad.AlkaiMetals.Cs;
import static com.mainacad.AlkaiMetals.Li;
import static com.mainacad.MetalSare.Ai;
import static com.mainacad.MetalSare.Sn;
import static com.mainacad.NotMetall.C;
import static com.mainacad.NotMetall.H;
import static java.lang.Enum.valueOf;

public class Main {
    public static void main(String[] args) {
        ChemicalElement object = new ChemicalElement("Li", 3, 3);
        ChemicalElement object2 = new ChemicalElement("Sn", 14, 10);
        ChemicalElement object3 = new ChemicalElement("C", 5, 2);
        ChemicalElement[] arr = {object, object2, object3};

        //Arrays.sort(arr, new ComparatorRlectroNegatinity());

        ChemicalElement.isAlcaiMetals(object2);
        ChemicalElement.isMetalSare(object2);
        ChemicalElement.isTransitionMetals(object2);

        Arrays.sort(arr, new Comparator<ChemicalElement>() {
                    @Override
                    public int compare(ChemicalElement o1, ChemicalElement o2) {
                        if (o1.name.equals( "C")) {
                            return -1;
                        } else if (o2.name.equals("C")) {
                            return 1;
                        } else if (o1.sybol > o2.sybol) {
                            return 1;
                        } else if (o2.sybol > o1.sybol) {
                            return -1;
                        }
                        return 0;

                    }
                }
        );
        for (ChemicalElement r : arr) {
            System.out.println(r);

        }
    }
}

