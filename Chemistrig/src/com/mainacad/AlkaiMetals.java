package com.mainacad;

enum AlkaiMetals {
    Li(3, 6.941),
    Na(11, 14.007),
    K(19, 39.098);

    private int elecrtonegatyvity;
    private double atomicMass;

    AlkaiMetals(int elecrtonegatyvity, double atomicMass) {
        this.elecrtonegatyvity = elecrtonegatyvity;
        this.atomicMass = atomicMass;
    }

    public int getElecrtonegatyvity() {
        return elecrtonegatyvity;
    }

    public double getAtomicMass() {
        return atomicMass;
    }
}