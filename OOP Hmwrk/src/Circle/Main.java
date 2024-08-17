package Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);

        Circle_2 circle2 = new Circle_2(5,"Blue");
        System.out.println(circle2);
        System.out.println(circle2.getArea());

        Circle_3 circle3 = new Circle_3(4);
        System.out.println(circle3);
        System.out.println(circle3.getArea());
    }
}
