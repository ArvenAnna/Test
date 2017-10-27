package com.mainacad;

import javafx.scene.paint.Color;

/**
 * This class create Rectangle shape using Points in Shape class and use paintingShape method and Color method
 */

public class Rectangle extends Shape { //changed by Zhuravel Andrey, inheritance from Shape class)

    public Rectangle(Point[] points) {
        super(points, 4);
    }

    @Override
    public void paintingShape() {
        System.out.println("This is my rectangle");
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
