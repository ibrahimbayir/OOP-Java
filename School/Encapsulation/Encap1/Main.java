package Examprep_2;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(23,"ibrahim",35);

        Invoice invoice = new Invoice(24,customer,400);


        System.out.println(invoice.getCustomer() );
        System.out.println(customer);
    }
}
