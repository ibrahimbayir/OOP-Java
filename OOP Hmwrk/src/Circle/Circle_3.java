package Circle;

public class Circle_3 {
    private double radius = 1.0;

    public Circle_3(){}

    public Circle_3(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle_3[" +
                "radius=" + radius +
                ']';
    }
}
