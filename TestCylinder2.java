package Buoi8;

public class TestCylinder2 {
    public static void main(String[] args) {
        Circle3 c1 = new Cylinder2(1.1, 2.2);
        System.out.println(c1.getRadius());
        System.out.println(c1.toString());
        System.out.println(c1.getArea());

        Circle3 c2 = new Circle3(1.1);
        Cylinder2 cy1 = new Cylinder2(2.2, 3.3);
        System.out.println(c2 instanceof Circle3);
        System.out.println(c2 instanceof Cylinder2);
        System.out.println(cy1 instanceof Cylinder2);
        System.out.println(cy1 instanceof Circle3);

        Circle3 c3 = new Cylinder2(4.4, 5.5);
        System.out.println(c2 instanceof Circle3);
        System.out.println(c2 instanceof Cylinder2);
    }
}
