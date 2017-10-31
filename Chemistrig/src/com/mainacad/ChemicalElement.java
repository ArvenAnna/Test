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

    public static boolean isAlcaiMetals(ChemicalElement e) {
        for (AlkaiMetals alkaiMetals : AlkaiMetals.values()) {
            if (e.name.equals(alkaiMetals.name())) {
                System.out.println("This element is AlkaiMetals");
                return true;
            }
        }
        System.out.println("This element is not AlkaiMetals");
        return false;
    }

    public static boolean isTransitionMetals(ChemicalElement e) {
        for (TransitionMetals transition : TransitionMetals.values()) {
            if (transition.name().equals(e.name)) {
                System.out.println("This element is Transition");
                return true;
            }
        }
        System.out.println("This element is not Transition");
        return false;
    }

    public static boolean isMetalSare(ChemicalElement e) {
        for (MetalSare metalSare : MetalSare.values()) {
            if (metalSare.name().equals(e.name)) {
                System.out.println("This element is MetalSare");
                return true;
            }
        }
        System.out.println("This element is not MetalSare");
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
