package com.mainacad;

public class ChemicalElement {

    private String name;
    private int elecrtonegatyvity;
    private double atomicMass;

    ChemicalElement(String name) {
        this.name = name;
        checkingElement();
    }

    ChemicalElement(int elecrtonegatyvity) {
        this.elecrtonegatyvity = elecrtonegatyvity;
        checkingElement();
    }

    ChemicalElement(double atomicMass) {
        this.atomicMass = atomicMass;
        checkingElement();
    }

    private boolean isAlcaiMetals() {
        for (AlkaiMetals alkaiMetals : AlkaiMetals.values()) {
            if (getName() == alkaiMetals.name() || getAtomicMass() == alkaiMetals.getAtomicMass() || getElecrtonegatyvity() == alkaiMetals.getElecrtonegatyvity()) {
                name = alkaiMetals.name();
                elecrtonegatyvity = alkaiMetals.getElecrtonegatyvity();
                atomicMass = alkaiMetals.getAtomicMass();
                return true;
            }
        }
        return false;
    }

    private boolean isTransitionMetals() {
        for (TransitionMetals transition : TransitionMetals.values()) {
            if (getName() == transition.name() || getAtomicMass() == transition.getAtomicMass() || getElecrtonegatyvity() == transition.getElecrtonegatyvity()) {
                name = transition.name();
                elecrtonegatyvity = transition.getElecrtonegatyvity();
                atomicMass = transition.getAtomicMass();
                return true;
            }
        }
        return false;
    }

    private boolean isMetalSare() {
        for (MetalSare metalSare : MetalSare.values()) {
            if (name == metalSare.name() || getAtomicMass() == metalSare.getAtomicMass() || getElecrtonegatyvity() == metalSare.getElecrtonegatyvity()) {
                name = metalSare.name();
                elecrtonegatyvity = metalSare.getElecrtonegatyvity();
                atomicMass = metalSare.getAtomicMass();
                return true;
            }
        }
        return false;
    }

    private boolean isNotMetall() {
        for (NotMetall notMetall : NotMetall.values()) {
            if (name == notMetall.name() || getAtomicMass() == notMetall.getAtomicMass() || getElecrtonegatyvity() == notMetall.getElecrtonegatyvity()) {
                name = notMetall.name();
                elecrtonegatyvity = notMetall.getElecrtonegatyvity();
                atomicMass = notMetall.getAtomicMass();
                return true;
            }
        }
        return false;
    }

    private void checkingElement() {
        if (isTransitionMetals()) ;
        else if (isNotMetall()) ;
        else if (isAlcaiMetals()) ;
        else if (isMetalSare()) ;
    }

    int getElecrtonegatyvity() {
        return elecrtonegatyvity;
    }

    String getName() {
        return name;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    @Override
    public String toString() {
        return "ChemicalElement{" +
                "name='" + name + '\'' +
                ", elecrtonegatyvity=" + elecrtonegatyvity +
                ", atomicMass=" + atomicMass +
                '}';
    }
}
