package Interface;

public class Circle implements GeometricObject{
    private double radius;

    public Circle(double radius) {
        this.radius=radius;
    }
    public String toString() {
        return "Circle[radius="+radius+"]";
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }//override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

}
