package com.mainacad;

enum NotMetall {

    C(6, 12.011),
    H(1, 1.0079);

    private int elecrtonegatyvity;
    private double atomicMass;

    NotMetall(int elecrtonegatyvity, double atomicMass) {
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
