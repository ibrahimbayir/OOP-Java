package Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5,7);
        System.out.println(rec);
        System.out.println(rec.getArea());
        rec.setWidth(15);
        System.out.println(rec.getArea());
    }
}
