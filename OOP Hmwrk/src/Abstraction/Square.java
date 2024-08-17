package Abstraction;

public class Square extends Rectangle{
    protected double side = 1.0;

    public Square(){

    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[" + "color= " + getColor() + ", filled=" + isFilled() + "]," + "width= " +
                side + ",length= " + side + "]";
    }
}
