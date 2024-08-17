package week6_hmwrk;

public class Rectangle
{
    private int short_side= 4;
    private int long_side = 9;
    private String color = "Blue";

    public Rectangle(){
    }

    public Rectangle(int short_side){
        this.short_side = short_side;
    }

    public Rectangle(int short_side, int long_side){
        this.short_side = short_side;
        this.long_side = long_side;
    }

    public void setLong_side(int long_side) {
        this.long_side = long_side;
    }

    public String toString(){
        return "Rectangle [short side=" + short_side + ", long_side=" + long_side + ", color=" + color + "]";
    }

    public int getArea(){
        int area = short_side * long_side;
        return area;
    }

    public int getLong_side() {
        return long_side;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setShort_side(int short_side) {
        this.short_side = short_side;
    }

    public int getShort_side() {
        return short_side;
    }
}
