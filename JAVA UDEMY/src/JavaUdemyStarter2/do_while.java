package JavaUdemyStarter2;
import java.util.Scanner;
public class do_while
{
    public static void main(String[] args)
    {
        /*
        do {
            //Koşul doğru olduğu sürece
            //whiledan farkı en az bir kere çalışmansının garanti olması
            }while(koşul);
         */
        //Bu program girilen sayının rakamlarını topluyor...
        Scanner input = new Scanner(System.in);
        int sayi,toplam=0;
        System.out.println("Lütfen birr sayı giriniz :  ");
        sayi = input.nextInt();

        do {
            toplam = toplam + sayi % 10;
            sayi = sayi /10;
        }while (sayi > 0);
        System.out.println("Rakamlar toplamı : "+ toplam);
    }
}
