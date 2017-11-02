package com.mainacad;

enum MetalSare {
    Al(13, 26.982),
    In(49, 114.82),
    Sn(50, 118.60);

    private int elecrtonegatyvity;
    private double atomicMass;

    MetalSare(int elecrtonegatyvity, double atomicMass) {
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

