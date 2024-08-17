package overloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10,20);
        calculator.add(10,20,30);
        System.out.println(calculator.add(15.5, 24.5));
        System.out.println(calculator.add(20.5,50.7,70.8));

    }
}
