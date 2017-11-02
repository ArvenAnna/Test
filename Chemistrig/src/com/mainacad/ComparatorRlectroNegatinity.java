package com.mainacad;

import java.util.Comparator;

public class ComparatorRlectroNegatinity implements Comparator <ChemicalElement> {

    public int compare(ChemicalElement o1, ChemicalElement o2) {

            if (o1.getElecrtonegatyvity() > o2.getElecrtonegatyvity()) {
                return 1;
            } else if (o1.getElecrtonegatyvity() < o2.getElecrtonegatyvity()) {
                return -1;
            }
                return 0;

            //throw new UnsupportedOperationException();
    }
}
