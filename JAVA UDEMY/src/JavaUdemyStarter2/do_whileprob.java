package JavaUdemyStarter2;
import java.util.Scanner;
public class do_whileprob
{
    public static void main(String[] args)
    {
           Scanner input = new Scanner(System.in);
           int sayi,basamak_sayisi;
           System.out.println("Lütfen bir sayı giriniz : ");
           sayi = input.nextInt();

           System.out.println("Basamak sayısı :");
           basamak_sayisi = input.nextInt();

           int gecici_sayi = sayi;
           double toplam = 0;

           do {
               int basamak_degeri = gecici_sayi % 10;
               gecici_sayi = gecici_sayi / 10;
               toplam = toplam + Math.pow(basamak_degeri,basamak_sayisi);
           }while(gecici_sayi > 0);

           if(sayi == toplam){
               System.out.println("Bu bir armstrong sayısıdır...");
           }
           else{
               System.out.println("DEĞİLDİR...");
           }
    }
}
