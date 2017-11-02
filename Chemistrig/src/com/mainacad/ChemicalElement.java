package com.mainacad;

public class ChemicalElement {

    private String name;
    private int elecrtonegatyvity;

    ChemicalElement(String name) {
        this.name = name;
        if (isTransitionMetals()) {
            for (TransitionMetals transitionMetals : TransitionMetals.values()) {
                if (transitionMetals.name().equals(name)) {
                    elecrtonegatyvity = transitionMetals.getElecrtonegatyvity();
                }
            }
        }
        if (isMetalSare()) {
            for (MetalSare metalSare : MetalSare.values()) {
                if (metalSare.name().equals(name)) {
                    this.elecrtonegatyvity = metalSare.getElecrtonegatyvity();

                }
            }
        }
        if (isAlcaiMetals()) {
            for (AlkaiMetals alkaiMetals : AlkaiMetals.values()) {
                if (alkaiMetals.name().equals(name)) {
                    elecrtonegatyvity = alkaiMetals.getElecrtonegatyvity();
                }
            }
        }
    }

    ChemicalElement(int elecrtonegatyvity) {
        this.elecrtonegatyvity = elecrtonegatyvity;

        for (TransitionMetals transitionMetals : TransitionMetals.values()) {
            if (transitionMetals.getElecrtonegatyvity() == elecrtonegatyvity) {
                name = transitionMetals.name();
            }
        }
        for (MetalSare metalSare : MetalSare.values()) {
            if (metalSare.getElecrtonegatyvity() == elecrtonegatyvity) {
                this.elecrtonegatyvity = metalSare.getElecrtonegatyvity();
                name = metalSare.name();
            }
        }
        for (AlkaiMetals alkaiMetals : AlkaiMetals.values()) {
            if (alkaiMetals.getElecrtonegatyvity() == elecrtonegatyvity) {
                name = alkaiMetals.name();
            }
        }
    }

    public boolean isAlcaiMetals() {
        for (AlkaiMetals alkaiMetals : AlkaiMetals.values()) {
            if (name.equals(alkaiMetals.name())) {
                return true;
            }
        }
        return false;
    }

    public boolean isTransitionMetals() {
        for (TransitionMetals transition : TransitionMetals.values()) {
            if (name.equals(transition.name())) {
                return true;
            }
        }
        return false;
    }

    public boolean isMetalSare() {
        for (MetalSare metalSare : MetalSare.values()) {
            if (name.equals(metalSare.name())) {
                return true;
            }
        }
        return false;
    }


    public int getElecrtonegatyvity() {
        return elecrtonegatyvity;
    }

    public String getName() {
       return name;
    }

    @Override
    public String toString() {
        return "ChemicalElement{" +
                "name = '" + name + '\'' +
                ", elecrtonegatyvity = " + elecrtonegatyvity +
                '}';
    }
}
