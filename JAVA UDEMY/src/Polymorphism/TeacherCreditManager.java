package Polymorphism;

public class TeacherCreditManager extends BaseCreditManager{
    @Override
    public double creditCalculate(double tutar) {
        return tutar * 1.20;
    }
}
