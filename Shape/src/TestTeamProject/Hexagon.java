package TestTeamProject;

import com.mainacad.Paintable;
import javafx.scene.paint.Color;

public class Hexagon implements Constructable, Paintable {

    private static final int POINTS_COUNT = 6;

    private final Point[] points;

    public Hexagon(Point[] points) {
        if (points.length != POINTS_COUNT) {
            throw new IllegalArgumentException("Hexagon must contain 6 point");
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
        throw new UnsupportedOperationException("Will be implemented next age");
    }

    @Override
    public double perimetrShape() {
        Otrezok otr = new Otrezok();
        double perimeter = 0;
        for (int i = 1; i < POINTS_COUNT; i++) {
            perimeter += otr.lang(points[i - 1].getX(), points[i].getX(), points[i - 1].getY(), points[i].getY());
        }
        perimeter += otr.lang(points[POINTS_COUNT - 1].getX(), points[0].getX(), points[POINTS_COUNT - 1].getY(), points[0].getY());
        return perimeter;
    }

    @Override
    public void paintingShape() {
        System.out.println("Hexagon");
    }

    @Override
    public Point[] getPoints() {
        return this.points;
    }

    @Override
    public Color getColor() {
        return Color.GOLD;
    }
}
