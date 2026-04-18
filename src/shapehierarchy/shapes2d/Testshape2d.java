package shapehierarchy.shapes2d;

public class Testshape2d {
    public static void main(String[] args) {
        Circle circle= new Circle(5);
        Square square =new Square(4);
        System.out.println(circle.toString());
        System.out.println(square.toString());

        System.out.println("circle area " + circle.area() );
    }
}