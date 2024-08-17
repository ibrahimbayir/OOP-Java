package JavaUdemyStarter.java_udemy_1;
import java.util.Scanner;
public class switch_case
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("İşlem numarası giriniz :");
        int islem = input.nextInt();

       //Switch case yapısı if else ile benzerdir işe yarayacağı pozisyonlar vardır.
        switch (islem){
            case 1:
                System.out.println("1.işlem");

            case 2:
                System.out.println("2.işlem");

            case 3:
                System.out.println("3.işlem");
                break;
            case 4:
                System.out.println("4.işlem");
                break;

                default:
                    System.out.println("Geçersiz işlem...");
                    break;

        }
    }
}
