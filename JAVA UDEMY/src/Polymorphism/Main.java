package Polymorphism;

public class Main {
    public static void main(String[] args) {
        BaseCreditManager creditManager = new StudentCreditManager();
        System.out.println(creditManager.creditCalculate(1000));

        BaseCreditManager creditManager1 = new TeacherCreditManager();
        System.out.println(creditManager1.creditCalculate(1000));

        BaseCreditManager creditManager2 = new SoldierCreditManager();
        System.out.println(creditManager2.creditCalculate(1000));

    }
}
