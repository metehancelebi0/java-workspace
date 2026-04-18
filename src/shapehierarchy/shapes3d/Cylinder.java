package shapehierarchy.shapes3d;

import shapehierarchy.shapes2d.Circle;

public class Cylinder extends Circle {
    private double Height;
    public Cylinder(double radius, double Heigt){

        super(radius);
        this.Height= Heigt;
    }
    public double volume(){
        return  Height*super.area();


    }

    @Override
    public double area() {
        return  2*super.area()+2*Math.PI*radius*Height;
    }

    @Override
    public String toString() {
        return "height = " + Height + "," + super.toString();
    }
}