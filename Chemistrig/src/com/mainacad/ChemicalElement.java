package com.mainacad;

public class ChemicalElement {
    String name;
    int sybol;
    int atomicNumber;

        // Vadym
    public ChemicalElement(String name, int sybol, int atomicNumber) {
        this.name = name;
        this.sybol = sybol;
        this.atomicNumber = atomicNumber;
    }

        // Vadym

    public boolean isAlcaiMetals() {
        throw new UnsupportedOperationException();
    }
    public boolean isTransitionMetals(){
        throw new UnsupportedOperationException();
    }
    public boolean isMetalSare(){
        throw new UnsupportedOperationException();
    }
}
