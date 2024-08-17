package Encapsulation_3;

public class Main {
    public static void main(String[] args) {
        Salary employee1 = new Salary();
         employee1.name = "ibrahim";
         employee1.lastName ="bayır";
         employee1.setSalary(45000);
         employee1.getInsurance_payment();

        //System.out.println(employee1.name + "\n" + employee1.lastName + "\n" + employee1.getSalary() + "\n" + employee1.getInsurance_payment());

        Salary employee2 = new Salary("Ayhan","Bayır",50000,6700);
        System.out.println();
        employee2.setSalary(7500);
        //System.out.println(employee2.name + "\n" + employee2.lastName + "\n" + employee2.getSalary() + "\n" + employee2.getInsurance_payment());

        employee2.SalaryCalculator(employee2.getSalary(), employee2.getInsurance_payment());
        employee1.SalaryCalculator(employee1.getSalary(), employee2.getInsurance_payment());
    }
}
