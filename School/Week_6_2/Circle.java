package Week_6_2;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle(){

    }
    public Circle(double r){
        this.radius = r;
    }
    public Circle(double r, String color){
        this.radius = r;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}


