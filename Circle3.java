package Buoi8;

public class Circle3 {
    private double radius;
    public Circle3(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
