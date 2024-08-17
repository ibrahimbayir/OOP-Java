package Constructor;

public class main {
    public static void main(String[] args) {
        Product product = new Product();//ilk constructor'mız
        System.out.println(product.name + product.model + product.price + product.stockAmount);

        Product product1 = new Product("ibrahim","ideapad",5000,300);//nesnenin değerleri haline geldi ve second constructor...
        System.out.println(product1.name +" " + product1.model + " " + product1.price + " " + product1.stockAmount );
    }

}
