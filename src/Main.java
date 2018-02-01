public class Main {
    public static void main(String[] args) {
        drawScene();
    }

    private static void drawScene() {
        Drawing drawing = new Drawing(800, 600);

        drawing.add(new ShapeGroup(
                new Rectangle(200, 300, 200, 125),
                new Rectangle(350, 220, 30, 80),
                new RightTriangle(300, 300, -110, -80),
                new RightTriangle(300, 300, 110, -80)
        ));

        drawing.show();
    }
}
