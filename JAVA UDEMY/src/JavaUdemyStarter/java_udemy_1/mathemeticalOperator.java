package JavaUdemyStarter.java_udemy_1;
import java.util.Scanner;
public class mathemeticalOperator
{
    public static void main(String[] args)
    { /*
        System.out.println(3 + 4f);
        System.out.println(3 + 5.2);
        System.out.println(10d / 4);
        System.out.println(3 * 4.5);
        System.out.println(10 % 4);
    */
        Scanner input = new Scanner(System.in);
        int yas ;
        System.out.println("bir yaş değeri giriniz : ");
        yas = input.nextInt();

        System.out.println("Yaşınız : " + yas);
    }
}
