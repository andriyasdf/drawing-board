import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing(800, 600);

        drawing.add(new Line(new Point2D.Double(100, 0), new Point2D.Double(200, 500)));

        drawing.add(new Rectangle(20, 20, 400, 100));
        drawing.add(new Rectangle(100, 400, 40, 40, 0x00FFFF33));
        drawing.add(new Rectangle(550, 300, 100, 200, 0x0068FEB0));

        drawing.add(new RightTriangle(300, 300, 100, 150, 0xFF2373b4));
        drawing.add(new RightTriangle(500, 200, 100, -80));
        drawing.add(new RightTriangle(400, 200, -100, 80));
        drawing.add(new RightTriangle(525, 325, -100, -80));

        drawing.show();
    }
}
