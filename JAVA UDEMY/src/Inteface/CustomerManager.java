package Inteface;

public class CustomerManager {
    Logger logger;//Dependency'nin ifadesi - Composition

    public CustomerManager(Logger newLogger){//Dependency injection
        this.logger = newLogger;
    }

    public void add(Customer customer){//parametremiz bir nesnedir
        System.out.println(customer.getFirstName() + " " +
                customer.getLastName() + " added to the database");

        //loglama yapmak istiyoruz

        this.logger.log();
    }
}
