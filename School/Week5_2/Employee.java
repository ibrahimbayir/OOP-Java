package Week5_2;

public class Employee
{
    private int employee_id;
    private String employee_name;
    private double employee_salary;



    public int getEmployee_id(){
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String emloyee_name) {
        this.employee_name = emloyee_name;
    }

    public double getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(double employee_salary) {
        this.employee_salary = employee_salary;
    }
}
