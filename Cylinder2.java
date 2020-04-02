package Buoi8;

public class Cylinder2 extends Circle3 {
    private double height;
    public Cylinder2(double height, double radius) {
        super(radius);
        this.height = height;
    }
    public  double getHeight() {
        return this.height;
    }
    public double getVolumne() {
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return 2.0 * Math.PI * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder2[height=" + height + "," + super.toString() + "]";
    }
}
