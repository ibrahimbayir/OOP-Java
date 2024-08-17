package Tİme_2;

public class Main {
    public static void main(String[] args) {
        Time myTime = new Time(19, 30, 60);
        System.out.println(myTime);
        System.out.println("Next Second " + myTime.nextSecond());
        System.out.println("Previous Second " + myTime.previousSecond());
    }
}