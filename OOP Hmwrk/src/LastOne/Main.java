package LastOne;

public class Main {
        public static void main(String[] args) {
            // Customer oluşturma
            Customer customer = new Customer(1, "John Doe", 'M');

            // Account oluşturma
            Account account1 = new Account(101, customer, 1000.0);

            // Diğer bir Account oluşturma (balance belirtilmemiş)
            Account account2 = new Account(102, customer);

            // Bilgileri yazdırma
            System.out.println("Account 1: " + account1);
            System.out.println("Account 2: " + account2);

            // Para yatırma ve çekme işlemleri
            account1.deposit(500.0);
            account2.withdraw(200.0);

            // Bilgileri tekrar yazdırma
            System.out.println("Account 1 (after deposit): " + account1.toString());
            System.out.println("Account 2 (after withdrawal): " + account2.toString());

            System.out.println(account1.getCustomer());
        }
    }

