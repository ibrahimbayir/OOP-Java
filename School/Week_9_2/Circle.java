package Week_9_2;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI* radius* radius;
    }

    public double getPerimeter(){//çevreyi hesaplıyor
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle = [radius = " + radius + " ,color = " + getColor() + " ,filled = " + isFilled() +", Area = " + getArea() + "]";
    }
}
