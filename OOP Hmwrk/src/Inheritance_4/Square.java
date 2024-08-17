package Inheritance_4;

public class Square extends Shape{
    private double side = 1.0;
    public Square(){

    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color,filled);
        this.side = side;
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

    public double getArea(){
        return side * side;
    }
    @Override
    public String toString() {
        return "Square[Rectangle[Shape[" + "color= " + getColor() + ", filled=" + isFilled() + "]," + "width= " +
                side + ",length= " + side + "]";
    }


}
