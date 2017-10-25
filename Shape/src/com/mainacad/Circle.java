package com.mainacad;


public class Circle implements Constructable {

    private double dimensionCircle;
    private final static double PI = 3.1415926536;

    public double getDimensionCircle() {
        return dimensionCircle;
    }

    public void setDimensionCircle(double dimensionCircle) {
        this.dimensionCircle = dimensionCircle;
    }


    @Override
    public double areaShape() {
        return PI * (dimensionCircle * dimensionCircle);
    }

    @Override
    public double perimetrShape() {
        return (2 * PI) * dimensionCircle;
    }

    @Override
    public void paintingShape() {
        System.out.println("You painting my circle ");
    }
}