import java.awt.*;
import java.awt.geom.Point2D;

public class RightTriangle extends Shape {
    private int width;
    private int height;

    public RightTriangle(int x, int y, int width, int height) {
        super(new Point2D.Double(x, y), new Point2D.Double(x + width, y), new Point2D.Double(x, y + height));
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public RightTriangle(int x, int y, int width, int height, int color) {
        this(x, y, width, height);
        this.color = color;
    }

    @Override
    public void drawOn(DrawingBoard db) {
        if (width > 0) {
            double slope = (points.get(1).getX() - points.get(0).getX())/Math.abs(height);
            double draw = points.get(1).getX();

            if (height > 0) {
                for (int y = (int)points.get(0).getY(); y < (int)points.get(2).getY(); y++) {
                    for (int x = (int)points.get(0).getX(); x < (int)draw; x++) {
                        db.imgArray[y][x] = color;
                    }
                    draw -= slope;
                }
            } else {
                for (int y = (int)points.get(0).getY(); y > (int)points.get(2).getY(); y--) {
                    for (int x = (int)points.get(0).getX(); x < (int)draw; x++) {
                        db.imgArray[y][x] = color;
                    }
                    draw -= slope;
                }
            }
        } else {
            double slope = (points.get(1).getX() - points.get(0).getX())/Math.abs(height);
            double draw = points.get(1).getX();

            if (height > 0) {
                for (int y = (int)points.get(0).getY(); y < (int)points.get(2).getY(); y++) {
                    for (int x = (int)points.get(0).getX(); x > (int)draw; x--) {
                        db.imgArray[y][x] = color;
                    }
                    draw -= slope;
                }
            } else {
                for (int y = (int)points.get(0).getY(); y > (int)points.get(2).getY(); y--) {
                    for (int x = (int)points.get(0).getX(); x > (int)draw; x--) {
                        db.imgArray[y][x] = color;
                    }
                    draw -= slope;
                }
            }
        }
    }
}
