package JavaUdemyStarter2;
import java.util.Scanner;
public class break_continue
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(true) {           //koşul true iken sonsuza kadar dönecek fakat break komutu ve koşulu ile sonlandıracağız...
            int islem = input.nextInt();
            if (islem == -1){
                System.out.println("Döngüden çıkılıyor...");
                break;
            }
            System.out.println("İşlem : " +islem);
        }


    }
}
