import java.util.Scanner;
public class not_ortalamasi
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int vize1,vize2,son;
        double ortalama,toplam_not;

        System.out.println("İlk vize sonucunuz : ");
        vize1 = input.nextInt();

        System.out.println("İkinci vize sonucunuz : ");
        vize2 = input.nextInt();

        System.out.println("Final notunuz : ");
        son =  input.nextInt();

        System.out.println("Son olarak ortalamanızı giriniz : ");
        ortalama = input.nextDouble();

        toplam_not = (vize1 * 30/100) + (vize2 * 30/100) + (son * 40/100);

        if(90 <= toplam_not){
            System.out.println("NOTUNUZ : AA");
        }
        else if (85 <= toplam_not) {
            System.out.println("NOTUNUZ : BA");
        }
        else if(80 <= toplam_not){
            System.out.println("NOTUNUZ : BB");
        }
        else if (75 <= toplam_not) {
            System.out.println("NOTUNUZ : CB");
        }
        else if (70 <= toplam_not) {
            System.out.println("NOTUNUZ : CC");
        }
        else if (65 <= toplam_not) {
            System.out.println("NOTUNUZ : DC");
        }
        else if (60 <= toplam_not) {
            System.out.println("NOTUNUZ : DD");
                if(ortalama< 2.50)
                    System.out.println("DD aldınız ve ortalamanız düşük ...");
        }
        else if (55 <= toplam_not) {
            System.out.println("NOTUNUZ : FD");
        }
        else
            System.out.println("NOTUNUZ : FF");



    }
}
