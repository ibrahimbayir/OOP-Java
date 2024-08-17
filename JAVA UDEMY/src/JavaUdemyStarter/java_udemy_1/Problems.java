package JavaUdemyStarter.java_udemy_1;
import java.util.Scanner;
public class Problems
{
    public static void main(String[] args)
    { /*
        Scanner input = new Scanner(System.in);
        System.out.println("Bu program vucut kitle indeksinizi hesaplar ");
        int kilo;
        double indeks,boy;

        System.out.println("Lütfen kilonuzu girin : ");
        kilo = input.nextInt();

        System.out.println("Lütfen boyunuzu girin : ");
        boy = input.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.println("Vucut kitle indeksiniz : " +indeks);
        */

        Scanner input = new Scanner(System.in);
        int km;
        double litre,tutar;


        System.out.println("Araç kilometrede kaç litre yakiyor");
        litre = input.nextDouble();

        System.out.println("Kaç km yapıldı ");
        km = input.nextInt();

        tutar = litre * km;

        System.out.println("Ödemeniz gereken miktar : " +tutar);


    }
}
