package com.mainacad;

enum AlkaiMetals {
    Li(3),
    Na(11),
    k(19),
    Rb(37),
    Cs(55),
    Fr(87);

    private int elecrtonegatyvity;

    private AlkaiMetals(int elecrtonegatyvity){
        this.elecrtonegatyvity = elecrtonegatyvity;
    }

    public int getElecrtonegatyvity() {
        return elecrtonegatyvity;
    }
}