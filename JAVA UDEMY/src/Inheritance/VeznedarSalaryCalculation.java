package Inheritance;

public class VeznedarSalaryCalculation extends BaseSalaryCalculation {

    public VeznedarSalaryCalculation(){
        super(1000,100);
    }

    @Override
    public void SalaryCalculation() {
        this.maas = (this.maas * oran/20 + 500);
        System.out.println("Cashier Salary : " + this.maas);

    }
}
