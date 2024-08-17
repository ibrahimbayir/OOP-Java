package Final;

public class Main {
    public static void main(String[] args) {
        // Müşteri oluştur
        Customer customer = new Customer(1, "John Doe", 10);

        // Fatura oluştur ve müşteriyi ata
        Invoice invoice = new Invoice(101, customer, 500.0);

        // Fatura bilgilerini yazdır
        System.out.println("Fatura Bilgileri:");
        System.out.println("Fatura ID: " + invoice.getId());
        System.out.println("Müşteri ID: " + invoice.getCustomerId());
        System.out.println("Müşteri Adı: " + invoice.getCustomerName());
        System.out.println("Müşteri İndirimi: " + invoice.getCustomerDiscount());
        System.out.println("Fatura Tutarı: " + invoice.getAmount());
        System.out.println("İndirim Uygulandıktan Sonraki Tutar: " + invoice.getAmountAfterDiscount());

        // Müşteri indirimini güncelle
        customer.setDiscount(15);

        // Fatura bilgilerini tekrar yazdır
        System.out.println("\nGüncellenmiş Fatura Bilgileri:");
        System.out.println("Fatura ID: " + invoice.getId());
        System.out.println("Müşteri ID: " + invoice.getCustomerId());
        System.out.println("Müşteri Adı: " + invoice.getCustomerName());
        System.out.println("Müşteri İndirimi: " + invoice.getCustomerDiscount());
        System.out.println("Fatura Tutarı: " + invoice.getAmount());
        System.out.println("İndirim Uygulandıktan Sonraki Tutar: " + invoice.getAmountAfterDiscount());
        invoice.setCustomer(23,"ibrahim",40);
}


}