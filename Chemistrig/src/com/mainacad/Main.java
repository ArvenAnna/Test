package com.mainacad;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import static com.mainacad.AlkaiMetals.Li;
import static com.mainacad.MetalSare.Ai;
import static com.mainacad.MetalSare.Sn;

public class Main {
    public static void main(String[] args) {
        ChemicalElement object = new ChemicalElement("Na",3,3);
//        ChemicalElement object2 = new ChemicalElement(Sn);
//        ChemicalElement object3 = new ChemicalElement();
//        ChemicalElement[] arr = {object, object2, object3};
//
//        Arrays.sort(arr, new ComparatorRlectroNegatinity());
//        Arrays.sort(arr, new Comparator<ChemicalElement>() {
//            @Override
//            public int compare(ChemicalElement o1, ChemicalElement o2) {
//                throw new UnsupportedOperationException();
//            }
//        });


        object.isAlcaiMetals(Li);

    }

}
