package Inheritance;

public class MudurSalaryCalculation extends BaseSalaryCalculation {
    public MudurSalaryCalculation(){
        super(1000,300);
    }

    @Override
    public void SalaryCalculation() {
        this.maas = (this.maas * oran/20);
        System.out.println("Manager salary :  " + this.maas);
    }
}
