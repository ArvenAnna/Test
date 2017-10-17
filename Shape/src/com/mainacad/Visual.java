package com.mainacad;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Visual extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Paintable shape Test");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        testShape(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void testShape(GraphicsContext gc) {
        Point p1 = new Point(70,10);
        Point p2 = new Point(130,10);
        Point p3 = new Point(160,60);
        Point p4 = new Point(130,110);
        Point p5 = new Point(70,110);
        Point p6 = new Point(40,60);

        Paintable hexagon = new Hexagon(new Point[]{p1, p2, p3, p4, p5, p6});

        drawShape(gc, hexagon);
    }

    private void drawShape(GraphicsContext gc, Paintable shape) {
        Point[] points = shape.getPoints();
        double[] xCoords = new double[points.length];
        double[] yCoords = new double[points.length];
        int i = 0;
        for (Point point : points) {
            xCoords[i] = point.getX();
            yCoords[i] = point.getY();
            i++;
        }

        gc.setFill(shape.getColor());
        gc.fillPolygon(xCoords,yCoords, points.length);
    }
}
