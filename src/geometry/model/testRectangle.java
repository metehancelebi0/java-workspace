package geometry.model;

public class testRectangle {
    public static void main(String[] args){
        Point topLeft = new Point(10,10);
        Rectangle rectangle = new Rectangle(5,6,topLeft);
        System.out.println("geometry.model.Rectangle area:" + rectangle.area());
        System.out.println("geometry.model.Rectangle perimeter:" + rectangle.perimeter());
        Point[] corners = rectangle.corners();

        for(int i=0; i< corners.length; i++) {
            System.out.printf(corners[i].xCoord + "," + corners[i].yCoord);
        }
    }
}
