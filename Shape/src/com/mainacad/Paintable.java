package com.mainacad;

import javafx.scene.paint.Color;

public interface Paintable {
    /**
     * Get color for filling the shape
     * @return color which will be applied for current shape
     */
    Color getColor();

    /**
     * Get points for building the shape in Cartesian coordinates
     * @return array of points
     */
    Point[] getPoints();
}
