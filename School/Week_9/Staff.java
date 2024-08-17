package Week_9;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String adress, String school, double pay){
        super(name ,adress);
        this.school = school;
        this.pay = pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
