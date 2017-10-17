package com.mainacad;

/*
area of a circle | S = Пr2 (квадрат)
circumference of a circle | C = 2πr (П 3.14)
 */

public class Circle implements Constructable {

    private double dimensionCircle;
    private final double Pi = 3.1415926536;

    public double getDimensionCircle() {
        return dimensionCircle;
    }

    public void setDimensionCircle(double dimensionCircle) {
        this.dimensionCircle = dimensionCircle;
    }


    @Override
    public double areaShape() {
        return Pi * (dimensionCircle * dimensionCircle);
    }

    @Override
    public double perimetrShape() {
        return (2 * Pi) * dimensionCircle;
    }

    @Override
    public void paintingShape() {
        System.out.println("You painting my circle ");
    }
}