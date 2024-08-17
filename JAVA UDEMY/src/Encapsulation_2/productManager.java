package Encapsulation_2;

public class productManager {//ürünü ekleyen : bir eylem : eylemin karşılığı metottur...
    public void add(Product product){//Object Referer parametremiz object diyebiliriz
        System.out.println("Product added to database...");
        product.setId("BeatsSoloWireless1");
        System.out.println(product.getId());

    }
}
