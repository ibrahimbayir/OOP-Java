package UDEMY_METHODS;
import java.util.Scanner;
public class first
{
   /* public static void faktoriyel() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi = input.nextInt();

        int faktoriyel = 1;

        while(sayi > 0){
            faktoriyel = faktoriyel * sayi;
            sayi--;
        }
        System.out.println("Faktoriyel : " + faktoriyel);
    }

    public static void main(String[] args) {
        faktoriyel();
    }
    */

    public static void selamla(String isim)
    {
        System.out.println("MERHABA, " + isim);
    }

    public static void main(String[] args) {
        selamla("EMİRCAN");
        selamla("LAN KALK HADİ AMK");
    }
}
