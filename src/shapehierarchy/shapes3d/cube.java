package shapehierarchy.shapes3d;

import shapehierarchy.shapes2d.Square;

public class cube extends Square {


    public cube(double side) {
        super(side);
    }
    public double volume(){
        return super.area()*side;


    }

    @Override
    public double area() {
        return super.area()*6;
    }
}