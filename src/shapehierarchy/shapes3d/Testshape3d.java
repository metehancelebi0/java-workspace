package shapehierarchy.shapes3d;

public class Testshape3d {
    public static void main(String[] args) {
        Cylinder cylinder= new Cylinder(4,5);
        cube Cube = new cube(6);

        System.out.println(cylinder.toString());
        System.out.println(Cube.toString());

        System.out.println(" cylinder area = " + cylinder.area());
        System.out.println("CYLİNDER volume" + cylinder.volume());
        System.out.println("cube area= " + Cube.area());
        System.out.println(" cube volume = " +Cube.volume());


    }
}