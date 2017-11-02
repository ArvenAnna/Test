package com.mainacad;

public class ChemicalElement {

    private String name;
    private int elecrtonegatyvity;
    private double atomicMass;

    ChemicalElement(String name) {
        this.name = name;
        if (isTransitionMetals()) {
            for (TransitionMetals transitionMetals : TransitionMetals.values()) {
                if (transitionMetals.name().equals(name)) {
                    elecrtonegatyvity = transitionMetals.getElecrtonegatyvity();
                    atomicMass = transitionMetals.getAtomicMass();
                }
            }
        }
        if (isMetalSare()) {
            for (MetalSare metalSare : MetalSare.values()) {
                if (metalSare.name().equals(name)) {
                    this.elecrtonegatyvity = metalSare.getElecrtonegatyvity();
                    atomicMass = metalSare.getAtomicMass();
                }
            }
        }
        if (isAlcaiMetals()) {
            for (AlkaiMetals alkaiMetals : AlkaiMetals.values()) {
                if (alkaiMetals.name().equals(name)) {
                    elecrtonegatyvity = alkaiMetals.getElecrtonegatyvity();
                    atomicMass = alkaiMetals.getAtomicMass();
                }
            }
        }
        if (isNotMetall()) {
            for (NotMetall notMetall : NotMetall.values()) {
                if (notMetall.name().equals(name)) {
                    elecrtonegatyvity = notMetall.getElecrtonegatyvity();
                    atomicMass = notMetall.getAtomicMass();
                }
            }
        }
    }

    ChemicalElement(int elecrtonegatyvity) {
        this.elecrtonegatyvity = elecrtonegatyvity;

        for (TransitionMetals transitionMetals : TransitionMetals.values()) {
            if (transitionMetals.getElecrtonegatyvity() == elecrtonegatyvity) {
                name = transitionMetals.name();
                atomicMass = transitionMetals.getAtomicMass();
            }
        }
        for (MetalSare metalSare : MetalSare.values()) {
            if (metalSare.getElecrtonegatyvity() == elecrtonegatyvity) {
                name = metalSare.name();
                atomicMass = metalSare.getAtomicMass();
            }
        }
        for (AlkaiMetals alkaiMetals : AlkaiMetals.values()) {
            if (alkaiMetals.getElecrtonegatyvity() == elecrtonegatyvity) {
                name = alkaiMetals.name();
                atomicMass = alkaiMetals.getAtomicMass();
            }
        }
        for (NotMetall notMetall : NotMetall.values()) {
            if (notMetall.getElecrtonegatyvity() == elecrtonegatyvity) {
                name = notMetall.name();
                atomicMass = notMetall.getAtomicMass();
            }
        }
    }

    ChemicalElement(double atomicMass) {
        this.atomicMass = atomicMass;
        for (TransitionMetals transitionMetals : TransitionMetals.values()) {
            if (transitionMetals.getAtomicMass() == atomicMass) {
                elecrtonegatyvity = transitionMetals.getElecrtonegatyvity();
                name = transitionMetals.name();
            }
        }

        for (MetalSare metalSare : MetalSare.values()) {
            if (metalSare.getAtomicMass() == atomicMass) {
                elecrtonegatyvity = metalSare.getElecrtonegatyvity();
                name = metalSare.name();
            }
        }

        for (AlkaiMetals alkaiMetals : AlkaiMetals.values()) {
            if (alkaiMetals.getAtomicMass() == atomicMass) {
                elecrtonegatyvity = alkaiMetals.getElecrtonegatyvity();
                name = alkaiMetals.name();
            }
        }

        for (NotMetall notMetall : NotMetall.values()) {
            if (notMetall.getAtomicMass() == atomicMass) {
                elecrtonegatyvity = notMetall.getElecrtonegatyvity();
                name = notMetall.name();
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

    public boolean isNotMetall() {
        for (NotMetall notMetall : NotMetall.values()) {
            if (name.equals(notMetall.name())) {
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
                ", atomicMass = " + atomicMass +
                '}';
    }
}
