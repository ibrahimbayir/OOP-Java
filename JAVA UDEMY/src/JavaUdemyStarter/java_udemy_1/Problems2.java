package JavaUdemyStarter.java_udemy_1;
import java.util.Scanner;
public class Problems2
{
    public static void main(String[] args)
    {
       /* Scanner input = new Scanner(System.in);
        int birinci_sayi;
        int ikinci_sayi;

        System.out.println("Birinci sayiyi giriniz : ");
        birinci_sayi = input.nextInt();

        System.out.println("İkinci sayiyi giriniz : ");
        ikinci_sayi = input.nextInt();

        int gecici = birinci_sayi;

        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;
        System.out.println("Birinci sayı : " + birinci_sayi + " İkinci sayı : " + ikinci_sayi);
        */

        Scanner input = new Scanner(System.in);
        int a,b;
        double hipotenus ;

        System.out.println("birinci kenarı giriniz : ");
        a = input.nextInt();

        System.out.println("ikinci kenarı giriniz : ");
        b = input.nextInt();

        hipotenus = Math.sqrt(a * a + b * b);

        System.out.println("Hipotenüs : " + hipotenus);

    }
}
