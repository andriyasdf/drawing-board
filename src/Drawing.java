import java.awt.geom.Point2D;


public class Drawing {
    private static int width = 800;
    private static int height = 600;

    public static DrawingBoard drawingBoard;

    public static void main(String[] args) {
        drawingBoard = new DrawingBoard(width, height);

        Line line = new Line(new Point2D.Double(20, 20), new Point2D.Double(400, 100));
        line.draw(drawingBoard);

        Rectangle rectangle = new Rectangle(20, 20, 400, 100);
        rectangle.draw(drawingBoard);

        RightTriangle rightTriangle = new RightTriangle(new Point2D.Double(500, 400), new Point2D.Double(300, 500));
        rightTriangle.draw(drawingBoard);



        drawingBoard.show();
    }
}
