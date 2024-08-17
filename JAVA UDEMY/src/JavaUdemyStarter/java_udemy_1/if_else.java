package JavaUdemyStarter.java_udemy_1;
import java.util.Scanner;
public class if_else
{
    public static void main(String[] args)
    {   //if else problem 1
        /*
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Değerleri giriniz : sırasıyla");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if(a < b)
            if(c < b)
                System.out.println("Max is b");
            else
                System.out.println("Max is c");
        else
            if (a > c)
                System.out.println("a is max");
            else
                System.out.println("max is c");
    */

            Scanner input = new Scanner(System.in);
            int kilo;
            double boy,bki;

            System.out.println("Lütfen boyunuzu giriniz : ");
            boy = input.nextDouble();

            System.out.println("Lütfen boyunuzu giriniz : ");
            kilo = input.nextInt();

            bki = kilo / (boy * boy);

            if(bki > 30){
                System.out.println("OBEZ");
            }
            else if (25 < bki) {
                System.out.println("Fazla kilolu");
            }
            else if (18.5 < bki) {
                System.out.println("NORMAL");
            }
            else
                System.out.println("ZAYIF");
    }

}
