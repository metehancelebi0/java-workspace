package shapesystem.drawing.version2;

import java.util.ArrayList;

import shapesystem.shapes.Circle;
import shapesystem.shapes.Rectangle;
import shapesystem.shapes.Square;

public class TestDrawing {

    public static void main(String[] args) {

        Drawing drawing = new Drawing();

        drawing.addShape(new Circle(5));
        drawing.addShape(new Rectangle(5,6));
        drawing.addShape(new Square(7));


        System.out.println("Total area = " + drawing.calculateTotalArea());
    }

}