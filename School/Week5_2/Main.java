package Week5_2;

public class Main
{
    public static void main(String[] args) {
        Employee myEmployee1 = new Employee();
        myEmployee1.setEmployee_id(1);
        myEmployee1.setEmployee_name("A");
        myEmployee1.setEmployee_salary(12.56);

        Employee myEmployee2 = new Employee();
        myEmployee2.setEmployee_id(1);
        myEmployee2.setEmployee_name("B");
        myEmployee2.setEmployee_salary(12.56);

        Employee myEmployee3 = new Employee();
        myEmployee3.setEmployee_id(1);
        myEmployee3.setEmployee_name("C");
        myEmployee3.setEmployee_salary(12.56);

        System.out.println(myEmployee1.getEmployee_name());

    }
}
