package JavaUdemyStarter.java_udemy_1;
import java.util.Scanner;
public class calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("*******************************");
        String islemler = "1. Toplama İşlemi\n"
                         +"2. Çıkarma İşlemi\n"
                         +"3. Çarpma İşlemi\n"
                         +"4. Bölme İşlemi ";
        System.out.println(islemler);
        System.out.println("*******************************");
        System.out.println("İşlemi seçiniz : ");
        String islem = input.nextLine();

        int a;
        int b;

        switch (islem){
            case "1":
                System.out.println("Birinci sayı");
                 a = input.nextInt();
                System.out.println("İkinci sayı");
                 b = input.nextInt();
                System.out.println("Toplam : " + (a + b));
                break;
            case "2":
                System.out.println("Birinci sayı");
                a = input.nextInt();
                System.out.println("İkinci sayı");
                b = input.nextInt();
                System.out.println("Çıkarma : " + (a - b));
                break;
            case "3":
                System.out.println("Birinci sayı");
                a = input.nextInt();
                System.out.println("İkinci sayı");
                b = input.nextInt();
                System.out.println("Çarpımları : " + (a * b));
                break;
            case "4":
                System.out.println("Birinci sayı");
                a = input.nextInt();
                System.out.println("İkinci sayı");
                b = input.nextInt();
                System.out.println("Toplam : " + ((double)a / b));
                break;
            default:
                System.out.println("Geçersiz işlem");
        }
    }
}
