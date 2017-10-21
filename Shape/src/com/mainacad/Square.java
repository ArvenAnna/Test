package com.mainacad;

import javafx.scene.paint.Color;

public class Square extends Shape  {

    public Square(Point[] points) {
        super(points,4);
    }

    @Override
    public void paintingShape() {
        System.out.println("This is my square");
    }

    @Override
    public Color getColor() {
        return Color.CORAL;
    }


}
