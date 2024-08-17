package Inheritance_4;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setColor("Green");
        System.out.println(circle);
        System.out.println();


        Rectangle rec = new Rectangle();
        rec.setWidth(20);
        rec.setLength(10);
        rec.setColor("Blue");
        System.out.println(rec);
        System.out.println();


        Square square = new Square();
        square.setWidth(5);// All attributes same because The square has 4 sides equally.
        square.setLength(10);
        square.setSide(20);
        square.setFilled(false);

        System.out.println(square);
    }
}
