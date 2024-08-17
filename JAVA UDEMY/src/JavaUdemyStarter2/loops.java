package JavaUdemyStarter2;
import java.util.Scanner;
public class loops
{
    public static void main(String[] args)
    {  /*
        Scanner input = new Scanner(System.in);
        int fakt =1,n;
        System.out.println("Faktöriyeli alınacak sayıyı girin : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++)
        {
            fakt = i * fakt;
        }
        System.out.println("sonuc : " + fakt);
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Faktöriyeli alınacak sayıyı giriniz : ");
        int n = input.nextInt();
        int i = 1,fakt=1;
        while(i <= n){
            fakt = fakt*i;
            i++;
        }
        System.out.println("sonuc : " +fakt);
    }
}
