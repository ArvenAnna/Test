package com.mainacad;

import javafx.scene.paint.Color;

// This class create Pentagon using Shape class and Overriding areaShape() method

public class Pentagon extends Shape{

    public Pentagon(Point[] points) {

        super(points, 5);
    }
    @Override
    public double areaShape() {
        Otrezok otrezok = new Otrezok(12.5, 56.1, 4.8, 56.6);
        double area = 0;
        for (int i = 1; i < POINTS_COUNT - 1; i++) {
            area += otrezok.lang(points[i - 1].getX(), points[0].getX(), points[i - 1].getY(), points[0].getY());
        }
        area *= otrezok.lang(points[POINTS_COUNT - 1].getX(), points[0].getX(), points[POINTS_COUNT - 1].getY(), points[0].getY())/4 * (Math.sqrt(25+10 * Math.sqrt(5)));

        return area;
    }

    @Override
    public void paintingShape(){
        System.out.println("You painting my pentagon");
    }
    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
