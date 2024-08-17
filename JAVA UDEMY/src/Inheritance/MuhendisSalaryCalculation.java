package Inheritance;

public class MuhendisSalaryCalculation extends BaseSalaryCalculation{

    public MuhendisSalaryCalculation(){
        super(1000,200);// Base ' in constructor'ını çağırdık...
    }

    public void SalaryCalculation(){
        this.maas = (maas * oran / 20);
        System.out.println("Engineer Salary : " + this.maas);
    }
}
