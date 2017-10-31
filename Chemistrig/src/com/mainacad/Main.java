package com.mainacad;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ChemicalElement object = new ChemicalElement("Li");
        ChemicalElement object2 = new ChemicalElement("Sn");
        ChemicalElement object3 = new ChemicalElement("C");
        ChemicalElement object4 = new ChemicalElement(19);
        ChemicalElement object5 = new ChemicalElement(49);
        ChemicalElement object6 = new ChemicalElement(50);
        ChemicalElement[] arr = {object,object2,object3,object4, object5, object6};


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

