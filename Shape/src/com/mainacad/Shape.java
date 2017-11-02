package com.mainacad;

public abstract class Shape implements Constructable, Paintable {
    protected int POINTS_COUNT;
    protected Point[] points;
//test
    public Shape(Point[] points, int POINTS_COUNT) { //changed by Zhuravel Andrey, was = public Realisation)
        this.POINTS_COUNT = POINTS_COUNT;
        if (points.length != POINTS_COUNT) {
            throw new IllegalArgumentException("Square must contain" + POINTS_COUNT + "point");
        }
        Point[] copyPoints = new Point[POINTS_COUNT];
        int i = 0;
        for (Point point : points) {
            copyPoints[i] = new Point(point.getX(), point.getY());
            i++;
        }
        this.points = copyPoints;
    }

    @Override
    public double areaShape() {
        Otrezok otrezok = new Otrezok(12.5, 56.1, 4.8, 56.6);
        double area = 0;
        for (int i = 1; i < POINTS_COUNT - 1; i++) {
            area += otrezok.lang(points[i - 1].getX(), points[0].getX(), points[i - 1].getY(), points[0].getY());
        }
        area *= otrezok.lang(points[POINTS_COUNT - 1].getX(), points[0].getX(), points[POINTS_COUNT - 1].getY(), points[0].getY());
        return area;
    }


    @Override
    public double perimetrShape() {
        Otrezok otr = new Otrezok(12.5, 56.1, 4.8, 56.6);
        double perimeter = 0.0;
        for (int i = 1; i < POINTS_COUNT; i++) {
            perimeter += otr.lang(points[i - 1].getX(), points[i].getX(), points[i - 1].getY(), points[i].getY());
        }
        perimeter += otr.lang(points[POINTS_COUNT - 1].getX(), points[0].getX(), points[POINTS_COUNT - 1].getY(), points[0].getY());
        return perimeter;
    }

    @Override
    public Point[] getPoints() {
        Point[] copyPoints = new Point[POINTS_COUNT];
        int i = 0;
        for (Point point : points) {
            copyPoints[i] = new Point(point.getX(), point.getY());
            i++;
        }
        return copyPoints;
    }


}
