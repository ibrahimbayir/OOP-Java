package Inteface;

public class Main  {
    public static void main(String[] args) {

        Customer customer = new Customer(213,1122,"ibrahim","bayır",2002);

        Logger logger = new DataBaseLogger();

        CustomerManager customerManager = new CustomerManager(logger);
        customerManager.add(customer);
    }
}
