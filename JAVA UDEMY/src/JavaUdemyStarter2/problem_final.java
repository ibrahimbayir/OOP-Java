package JavaUdemyStarter2;
import java.util.Scanner;
public class problem_final
{
    public static void main(String[] args)
    {   /*
        Scanner input = new Scanner(System.in);
        System.out.println("Bir isim giriniz : ");
        String name = input.nextLine();

        System.out.println("Paraolayı giriniz: ");
        String parola = input.nextLine();

        if(name.equals("ibrahim")){
            if(parola.equals("Ali12345")){
                System.out.println("HOŞGELDİNİZ...");
            }
            else{
                System.out.println("Parolanız yanlış, tekrar deneyinix...");
            }
        }
    */
        Scanner input = new Scanner(System.in);
        int giris_hakki = 3;
        String sys_kullaniciadi = "İbrahim";
        String sys_parola = "Ali12345";

        System.out.println("************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
        System.out.println("************");

        while (true){
            System.out.println("Kullanıcı adı : ");
            String kullanici_adi = input.nextLine();

            System.out.println("Parola : ");
            String parola = input.nextLine();

            if(kullanici_adi.equals(sys_kullaniciadi) && parola.equals(sys_parola)){
                System.out.println("Hoşgeldiniz...");
                break; //bu blok tamamen doğru olduğu için ve while'ı sondurmak için break kullaniyoruz!!!
            }
            else if(kullanici_adi.equals(sys_kullaniciadi) && !parola.equals(sys_parola)){
                System.out.println("Parolayı yanlış girdiniz...");
                giris_hakki = giris_hakki - 1;
                System.out.println("Kalan giriş hakkı : " + giris_hakki);
            }
            else if (!kullanici_adi.equals(sys_kullaniciadi) && parola.equals(sys_parola)){
                System.out.println("Kullancı adınızı yanlış girdiniz... ");
                giris_hakki = giris_hakki -1;
                System.out.println("Kalan giriş hakkı : " + giris_hakki);
            }
            else{
                System.out.println("Kullanıcı adını ve parolanızı yanlış girdiniz...");
                giris_hakki = giris_hakki -1;
                System.out.println("Kalan giriş hakkı : " + giris_hakki);
            }


        }

    }
}
