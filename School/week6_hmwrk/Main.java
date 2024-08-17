package week6_hmwrk;

public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(5);
        Rectangle rec3 = new Rectangle(10,18);

        rec1.setColor("BUSBLUE");
        rec3.setColor("PARLAMENT MAVİSİİ");

        rec1.setShort_side(7);

        System.out.println(rec1);
        System.out.println(rec1.getArea());

        System.out.println(rec2);
        System.out.println(rec2.getArea());

        System.out.println(rec3);
        System.out.println(rec3.getArea());


    }



}
