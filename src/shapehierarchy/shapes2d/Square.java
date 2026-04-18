package shapehierarchy.shapes2d;

public class Square {
    protected  double side;
    public Square(double side) {
        this.side=side;
    }


    public double area() {
        return side*side;

    }
    public String toString(){
        return "side = "+ side;

    }
}