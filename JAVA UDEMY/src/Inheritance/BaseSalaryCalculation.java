package Inheritance;

public class BaseSalaryCalculation {
    public int maas;//attributes
    public int oran;

    public BaseSalaryCalculation(){//Default Constructor

    }

    public BaseSalaryCalculation(int maas, int oran){//Constructor
        this.maas = maas;
        this.oran = oran;
    }


    public void SalaryCalculation(){
        this.maas = (this.maas * oran/20);//fix formül
        System.out.println(this.maas);
    }

}
