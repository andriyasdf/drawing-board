import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Shape implements Drawable {
    ArrayList<Point2D> points = new ArrayList<>();

    public Shape(Point2D... point) {
        points.addAll(Arrays.asList(point));
    }

    @Override
    public void draw(DrawingBoard db) {
        for (Point2D p : points) {
            db.imgArray[(int)p.getX()][(int)p.getY()] = Color.WHITE.getAlpha() + Color.WHITE.getRGB();
        }
    }

    @Override
    public boolean within(DrawingBoard db) {
        for (Point2D p : points) {
            if (!Drawing.drawingBoard.contains((Point)p)) return false;
        }

        return true;
    }
}
