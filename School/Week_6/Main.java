package Week_6;

public class Main {
    public static void main(String[] args) {
        Circle mycircle1 = new Circle();
        System.out.println(mycircle1);

        Circle mycircle2 = new Circle(5.0);
        System.out.println(mycircle2);

        System.out.println("1st Circle Area : " + mycircle1.getArea());
        System.out.println("2nd Circle Area : " + mycircle2.getArea());
    }
}
