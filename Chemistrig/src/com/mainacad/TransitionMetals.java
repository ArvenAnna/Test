package com.mainacad;

enum TransitionMetals {
    Hf(72, 178.4),
    Ta(73,180.647),
    W(74,183.8);

    private int elecrtonegatyvity;
    private double atomicMass;

    TransitionMetals(int elecrtonegatyvity,double atomicMass) {
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
