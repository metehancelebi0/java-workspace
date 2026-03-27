package geometry.model;

public class TestCircle {
    public static void main(String[] args){
        Circle circle = new Circle(5,new Point(10,10));
        System.out.println("geometry.model.Circle Area:" + circle.area());
        System.out.println("geometry.model.Circle Perimeter:" + circle.perimeter());

        Circle circleA = new Circle(20,new Point(20,20));
        boolean intersect = circle.intersect(circleA);
        if(intersect){
            System.out.println("geometry.model.Circle is intersecting");
        }else{
            System.out.println("geometry.model.Circle is not intersecting");
        }
    }
}
