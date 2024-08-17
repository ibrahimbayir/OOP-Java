package Constructor;

public class Product
{
    public String name = "ibrahim";
    public String model;
    public int price ;
    public int stockAmount;

    public Product(){//default constructor examples
        this.name = name;
        this.model = "Pro";
        this.price = 4000;
        this.stockAmount = 550;
    }
    public Product(String name, String model, int price, int stockAmount){//parametrized constructor
        this.name = name;
        this.model = model;
        this.price = price;
        this.stockAmount = stockAmount;
    }
}
