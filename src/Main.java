import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing(1000, 800);

        drawing.add(new Line(new Point2D.Double(100, 0), new Point2D.Double(200, 500)));

        drawing.add(new Rectangle(20, 20, 400, 100));
        drawing.add(new Rectangle(100, 400, 40, 40, 0x00FFFF33));
        drawing.add(new Rectangle(500, 300, 100, 200, 0x0068FEB0));
        drawing.add(new Rectangle(300, 300, 1000, 100, 0x00FFFEBF));
        drawing.add(new ShapeGroup(new Rectangle(700, 200, 100, 200), new RightTriangle(100, 200, 100, -100, 0x000000)));

        drawing.show();
    }
}
