package Examprep_2;

public class Customer {
    private int id;
    private String name;
    private int discount;


    public Customer(int id,String name, int discount) {
        this.id=id;
        this.name=name;
        this.discount= discount;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


    public int getDiscount() {
        return discount;
    }


    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", discount=" + discount + "]";
    }


}

