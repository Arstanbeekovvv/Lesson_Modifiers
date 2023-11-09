package HomeWork;

public class Circle {
    private final double PI = Math.PI;
    private double radius;
    public double getPI() { return PI;}
    public double getRadius() { return radius;}
    public void setRadius(double radius) { this.radius = radius;}

    public static void area(Circle circle){
        System.out.println(circle.getPI() * (circle.getRadius() * circle.getRadius()));
    }
    public static void circumference(Circle circle){
        System.out.println(circle.getPI() * 2 * circle.getRadius());
    }


}
