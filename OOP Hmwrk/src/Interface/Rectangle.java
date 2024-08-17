package Interface;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.length=length;
        this.width=width;
    }
    public String toString() {
        return "Rectangle[width="+width+",length="+length+"]";
    }
    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return 2*(width+length);
    }
}
