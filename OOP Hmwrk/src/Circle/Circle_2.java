package Circle;

public class Circle_2 {
    private double radius = 1.0;
    private String color = "red";

    public Circle_2(){

    }

    public Circle_2(double radius){
        this.radius = radius;
    }

    public Circle_2(double radius , String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle_2[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
