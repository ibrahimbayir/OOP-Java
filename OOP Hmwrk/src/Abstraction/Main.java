package Abstraction;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        Square square=new Square();

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
        System.out.println("area of the circle:"+circle.getArea());
        System.out.println("perimeter of the circle:"+circle.getPerimeter());
        System.out.println("area of the rectangle:"+rectangle.getArea());
        System.out.println("perimeter of the rectangle:"+rectangle.getPerimeter());
        System.out.println("area of the square:"+square.getArea());
        System.out.println("perimeter of the square:"+square.getPerimeter());

    }
}
