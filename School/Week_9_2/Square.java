package Week_9_2;

public class Square extends Shape {
    private double side;

    public Square(){

    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side , String color, Boolean filled){
        super(color,filled);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
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
        return "Square = [side = " + side + " ,color = " + getColor() + " ,filled = " + isFilled() +", Area = " + getArea() + "]";
    }
}
