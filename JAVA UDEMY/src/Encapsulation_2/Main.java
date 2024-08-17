package Encapsulation_2;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Beats", "solo",200,"black");//const kullandik
        System.out.println("products's brand = "+product.brand + " product's model : "+product.model + " product's stocakAmount: "+product.stockAmount + "Product's color : "+product.color);

        productManager product_manager = new productManager(); 
        product_manager.add(product);
    }
}
