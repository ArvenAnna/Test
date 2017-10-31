package com.mainacad;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import static com.mainacad.AlkaiMetals.Cs;
import static com.mainacad.AlkaiMetals.Li;
import static com.mainacad.MetalSare.Ai;
import static com.mainacad.MetalSare.Sn;
import static java.lang.Enum.valueOf;

public class Main {
    public static void main(String[] args) {
        ChemicalElement object = new ChemicalElement("Na", 6, 3);
        ChemicalElement object2 = new ChemicalElement("Sn", 4, 10);
        ChemicalElement object3 = new ChemicalElement("K", 5, 2);
        ChemicalElement[] arr = {object, object2, object3};

        //  Arrays.sort(arr, new ComparatorRlectroNegatinity());

        Arrays.sort(arr, new Comparator<ChemicalElement>() {
                    @Override
                    public int compare(ChemicalElement o1, ChemicalElement o2) {
                        if (o1.name.equals("C") || o2.name.equals("C")) {
                            NotMetall.C.setElecrtonegatyvity(1);
                            NotMetall.H.setElecrtonegatyvity(2);
                        }
                        if (o1.atomicNumber > o2.atomicNumber)
                            return -1;
                        if (o2.atomicNumber > o1.atomicNumber)
                            return 1;
                        return 0;

                    }
                }
        );
        for (ChemicalElement r : arr) {
            System.out.println(r);

        }
    }
}

