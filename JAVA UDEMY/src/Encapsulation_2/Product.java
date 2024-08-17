package Encapsulation_2;

public class Product {
    //Attributes
    private String id;
    public String brand;
    public String model;
    public int stockAmount;
    public String color;

    public Product(String brand,String model, int stockAmount, String color){
        this.brand = brand;
        this.model = model;
        this.stockAmount = stockAmount;
        this.color = color;
    }

    public void setId(String id) {
        //this.id = id;
        this.id = id.substring(0,1) + id.substring(5,6) + id.substring(9,10) + id.substring(17,18);
    }

    public String getId() {
        return id;
    }
}
