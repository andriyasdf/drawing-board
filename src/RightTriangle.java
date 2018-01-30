import java.awt.*;
import java.awt.geom.Point2D;

public class RightTriangle extends Shape {
    public RightTriangle(int x, int y, int width, int height, int color) {
        super(new Point2D.Double(x, y), new Point2D.Double(x-height, y), new Point2D.Double(x, y+width));
        this.color = color;
    }


}
