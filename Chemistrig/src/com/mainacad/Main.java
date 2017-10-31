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
        ChemicalElement object = new ChemicalElement("Li");
        ChemicalElement object2 = new ChemicalElement("Sn");
        ChemicalElement object3 = new ChemicalElement("C");
        ChemicalElement[] arr = {object, object2, object3};

        // Arrays.sort(arr, new ComparatorRlectroNegatinity());

        Arrays.sort(arr, new Comparator<ChemicalElement>() {
                    @Override
                    public int compare(ChemicalElement o1, ChemicalElement o2) {
                        if (o1.getName().equals("C")) {
                            return -1;
                        } else if (o2.getName().equals("C")) {
                            return 1;
                        } else if (o1.getElecrtonegatyvity() > o2.getElecrtonegatyvity()) {
                            return 1;
                        } else if (o2.getElecrtonegatyvity() > o1.getElecrtonegatyvity()) {
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

