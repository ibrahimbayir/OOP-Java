package Examprep_3;

public class Customer {
    private int id;
    private String name;
    private char gender;
    private int discount;

    public Customer(int id, String name, int discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        if (gender == 'm' || gender == 'M'){
            System.out.println("M");
        }
        else if (gender == 'f' || gender == 'F') {
            System.out.println("F");
        }
        return gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", discount=" + discount +
                '}';
    }
}
