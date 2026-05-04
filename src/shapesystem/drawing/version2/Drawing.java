package shapesystem.drawing.version2;

import java.util.ArrayList;

import shapesystem.shapes.Circle;
import shapesystem.shapes.Rectangle;
import shapesystem.shapes.Square;

public class Drawing {

    private ArrayList<Object> shapes = new ArrayList<>();

    public double calculateTotalArea(){
        double totalArea = 0;

        for (Object shape : shapes){
            if(shape instanceof Circle) {
                totalArea += ((Circle)shape).area();
            }
            else if(shape instanceof Rectangle) {
                totalArea += ((Rectangle)shape).area();
            }
            else if(shape instanceof Square) {
                totalArea += ((Square)shape).area();
            }
        }


        return totalArea;
    }

    public void addShape(Object object) {
        shapes.add(object);
    }

}
