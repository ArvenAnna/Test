package com.mainacad;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ChemicalElement object = new ChemicalElement("Li");
        ChemicalElement object2 = new ChemicalElement("Sn");
        ChemicalElement object3 = new ChemicalElement("C");
        ChemicalElement object4 = new ChemicalElement(19);
        ChemicalElement object5 = new ChemicalElement(49);
        ChemicalElement object6 = new ChemicalElement(50);
        ChemicalElement object7 = new ChemicalElement(114.82);
        ChemicalElement object8 = new ChemicalElement(39.098);
        ChemicalElement object9 = new ChemicalElement(178.4);
        ChemicalElement object10 = new ChemicalElement(1);


        ChemicalElement[] arr = {object, object2, object3, object4, object5, object6, object7, object8, object9, object10};

        Arrays.sort(arr, new ComparatorRlectroNegatinity());
        for (ChemicalElement r : arr) {
            System.out.println(r);
        }
        System.out.println();

        Arrays.sort(arr, (o1, o2) -> {
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
        );

        for (ChemicalElement r : arr) {
            System.out.println(r);
        }
    }
}

