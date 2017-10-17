package TestTeamProject;

import com.mainacad.Paintable;
import javafx.scene.paint.Color;

public class Square implements Constructable, Paintable {
    private static final int POINTS_COUNT = 4;
    private final Point[] points ;

    public Square(Point[] points) {
        if (points.length != POINTS_COUNT) {
            throw new IllegalArgumentException("Square must contain 4 point");
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
        Otrezok otrezok = new Otrezok();
        double area = 0;
        for (int i = 1; i < POINTS_COUNT - 1; i++) {
            area += otrezok.lang(points[i - 1].getX(), points[0].getX(), points[i - 1].getY(), points[0].getY());
        }
        area *= otrezok.lang(points[POINTS_COUNT - 1].getX(), points[0].getX(), points[POINTS_COUNT - 1].getY(), points[0].getY());
        return area;
    }


    @Override
    public double perimetrShape() {
        Otrezok otr = new Otrezok();
        double perimeter = 0.0;
        for (int i = 1; i < POINTS_COUNT; i++) {
            perimeter += otr.lang(points[i - 1].getX(), points[i].getX(), points[i - 1].getY(), points[i].getY());
        }
        perimeter += otr.lang(points[POINTS_COUNT - 1].getX(), points[0].getX(), points[POINTS_COUNT - 1].getY(), points[0].getY());
        return perimeter;
    }

    @Override
    public void paintingShape() {
        System.out.println("This is my square");
    }

    @Override
    public Color getColor() {
        return Color.CORAL;
    }

    @Override
    public Point[] getPoints() {
        return points;
    }
}
