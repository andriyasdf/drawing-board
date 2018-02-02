public class Main {
    public static void main(String[] args) {
        drawScene();
    }

    private static void drawScene() {
        Drawing drawing = new Drawing("maxresdefault.jpg");

        drawing.add(
                new ShapeGroup(
                        new ShapeGroup(
                                new Rectangle(0, 400, 800, 200, 0xFF1ead01),
                                new Line(0, 400, 800, 400, 0xFF1ead01)
                        ),
                        new Rectangle(200, 300, 200, 125),
                        new Rectangle(350, 220, 30, 80, 0xFFa0931b),
                        new RightTriangle(300, 300, -110, -80, 0xFFb0a41b),
                        new RightTriangle(300, 300, 110, -80, 0xFFb0a41b)
                ),
                new Line(500, 500, 400, 400)
        );

        drawing.show();
    }
}
