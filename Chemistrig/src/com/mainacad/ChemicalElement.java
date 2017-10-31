package com.mainacad;

public class ChemicalElement {
    String name;
    int sybol;
    int atomicNumber;

    public ChemicalElement(String name, int sybol, int atomicNumber) {
        this.name = name;
        this.sybol = sybol;
        this.atomicNumber = atomicNumber;
    }

    public boolean isAlcaiMetals(AlkaiMetals e) {
        for (AlkaiMetals alkaiMetals : AlkaiMetals.values()) {
            if (alkaiMetals.getElecrtonegatyvity() == e.getElecrtonegatyvity()) {
                System.out.println(e.getElecrtonegatyvity());
                return true;
            }
        }
        return false;

    }

    public boolean isTransitionMetals(TransitionMetals e) {
        for (TransitionMetals transition : TransitionMetals.values()) {
            if (transition.getElecrtonegatyvity() == e.getElecrtonegatyvity()) {
                System.out.println(e.getElecrtonegatyvity());
                return true;
            }
        }
        return false;
    }

    public boolean isMetalSare(MetalSare e) {
        for (MetalSare metalSare : MetalSare.values()) {
            if (metalSare.getElecrtonegatyvity() == e.getElecrtonegatyvity()) {
                System.out.println(e.getElecrtonegatyvity());
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ChemicalElement{" +
                "name='" + name + '\'' +
                ", sybol=" + sybol +
                ", atomicNumber=" + atomicNumber +
                '}';
    }
}
