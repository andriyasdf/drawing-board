import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing(1000, 800);

        drawScene();
    }

    private static void drawTest() {

    }

    private static void drawScene() {
        Drawing drawing = new Drawing(800, 600);

        ShapeGroup house = new ShapeGroup(
                new Rectangle(300, 300, 200, 200),
                new RightTriangle(300, 300, -100, 80),
                new RightTriangle(300, 300, 100, 80)
        );

        drawing.show();
    }
}
