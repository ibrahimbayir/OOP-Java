package JavaUdemyStarter2;
import java.util.Scanner;
public class problem1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int bakiye = 1000;
        String islemler= "1. İşlem : Bakiye öğrenme\n"
                        +"2. İşlem : Para çekme\n"
                        +"3. İşlem : Para yatırma\n"
                        +"Çıkış için q ya basın";

        System.out.println("*********************");
        System.out.println(islemler);
        System.out.println("*** ******************");

        while (true){
            System.out.println("İşlemi seçiniz : ");
            String islem = input.nextLine();

            if(islem.equals("q"))
            {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if (islem.equals("1"))
            {
                System.out.println("Bakiyeniz : " +bakiye);
            }
            else if(islem.equals("2"))
            {
                System.out.println("Çekmek istediğiniz tutar : ");
                int tutar = input.nextInt();
                input.nextLine();
                    if(bakiye - tutar < 0)
                    {
                        System.out.println("Yeterli bakiyeniz bulunmamaktadır. Bakiyeniz : "+bakiye);
                    }
                    else
                    {
                        bakiye = bakiye - tutar;
                        System.out.println("Yeni bakiyeniz : " + bakiye);
                    }
            }
            else if (islem.equals("3"))
            {
                System.out.println("Yatırmak istediğniz miktarı giriniz : ");
                int miktar = input.nextInt();
                input.nextLine();
                bakiye = bakiye + miktar; //bakiye+=tutar
                System.out.println("Yeni bakiyeniz : " + bakiye);
            }
            else
                System.out.println("GEÇERSİZ İŞLEM....");
        }
    }
}
