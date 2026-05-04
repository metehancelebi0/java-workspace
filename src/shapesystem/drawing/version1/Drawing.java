package shapesystem.drawing.version1;

import java.util.ArrayList;

import shapesystem.shapes.Circle;
import shapesystem.shapes.Rectangle;
import shapesystem.shapes.Square;

public class Drawing {

    private ArrayList<Circle> circles = new ArrayList<Circle>();
    private ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
    private ArrayList<Square> squares = new ArrayList<>();
    public double calculateTotalArea(){
        double totalArea = 0;

        for (Circle circle : circles){
            totalArea += circle.area();
        }

        for (Rectangle rect : rectangles){
            totalArea += rect.area();
        }

        for (Square square : squares){
            totalArea += square.area();
        }

        return totalArea;
    }

    public void addCircle(Circle c) {
        circles.add(c);
    }

    public void addRectangle(Rectangle r) {
        rectangles.add(r);
    }

    public void addSquare(Square square) {
        squares.add(square);

    }
}