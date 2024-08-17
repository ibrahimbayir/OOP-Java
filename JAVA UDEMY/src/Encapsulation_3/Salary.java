package Encapsulation_3;

public class Salary {
    public String name;
    public String lastName;
    private int salary;
    private int insurance_payment = 10000;

    public Salary(){
        System.out.println("Welcome to our company program for showing the salary of employees");
    }

    public void SalaryCalculator(int person, int insurance){
        int toplam = person + insurance;
        System.out.println("Total salary is " + toplam);
    }

    public Salary(String name, String lastName, int salary, int insurance_payment){
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.insurance_payment= insurance_payment;
    }




    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getInsurance_payment() {
        return insurance_payment;
    }

    public void setInsurance_payment(int insurance_payment) {
        this.insurance_payment = insurance_payment;
    }



}
