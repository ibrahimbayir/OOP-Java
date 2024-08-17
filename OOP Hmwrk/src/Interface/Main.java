package Interface;

public class Main {
        public static void main(String[] args) {
            GeometricObject mycircle=new Circle(4.0);
            GeometricObject myrectangle=new Rectangle(6.0,5.0);
            System.out.println(mycircle);
            System.out.println(myrectangle);
            System.out.println("area of the circle:"+mycircle.getArea());
            System.out.println("perimeter of the circle:"+mycircle.getPerimeter());
            System.out.println("area of the rectangle:"+myrectangle.getArea());
            System.out.println("perimeter of the rectangle:"+myrectangle.getPerimeter());
        }
    }

