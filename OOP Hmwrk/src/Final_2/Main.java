package Final_2;

public class Main {
    public static void main(String[] args) {
        // Yazar oluştur
        Author author = new Author("John Doe", "john.doe@example.com");

        // Kitap oluştur ve yazarı ata
        Book book = new Book("123456789", "Sample Book", author, 29.99, 10);

        // Kitap bilgilerini yazdır
        System.out.println("Kitap Bilgileri:");
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Kitap Adı: " + book.getName());
        System.out.println("Yazar: " + book.getAuthorName());
        System.out.println("Fiyat: $" + book.getPrice());
        System.out.println("Stok Adedi: " + book.getQty());
        System.out.println("Toplam Fiyat: $" + book.getPrice() * book.getQty());

        // Fiyatı güncelle
        book.setPrice(39.99);

        // Stok adedini güncelle
        book.setQty(20);

        // Kitap bilgilerini tekrar yazdır
        System.out.println("\nGüncellenmiş Kitap Bilgileri:");
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Kitap Adı: " + book.getName());
        System.out.println("Yazar: " + book.getAuthorName());
        System.out.println("Fiyat: $" + book.getPrice());
        System.out.println("Stok Adedi: " + book.getQty());
        System.out.println("Toplam Fiyat: $" + book.getPrice() * book.getQty());

        System.out.println(book.getAuthor());
    }
}
