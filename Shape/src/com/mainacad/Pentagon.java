package com.mainacad;

import javafx.scene.paint.Color;

// This class create Pentagon using Shape class and Overriding areaShape() method

public class Pentagon extends Shape{

    public Pentagon(Point[] points) {
        super(points, 5);
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
