import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Shape implements Drawable {
    ArrayList<Point2D> points = new ArrayList<>();
    int color = 0x00FFFFFF;

    public Shape(Point2D... point) {
        points.addAll(Arrays.asList(point));
    }

    @Override
    public void draw(DrawingBoard db) {
        for (Point2D p : points) {
            db.imgArray[(int)p.getX()][(int)p.getY()] = color;
        }

        for (int i = 0; i < points.size(); i++) {
            Line line = new Line(points.get(i), points.get((i+1) % points.size()));
            line.draw(db);
        }
    }

    @Override
    public boolean within(DrawingBoard db) {
        for (Point2D p : points) {
            if (!db.contains((int)p.getX(), (int)p.getY())) return false;
        }

        return true;
    }
}
