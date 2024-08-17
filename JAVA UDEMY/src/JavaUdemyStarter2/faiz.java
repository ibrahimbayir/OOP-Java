package JavaUdemyStarter2;
import java.util.Scanner;
public class faiz
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double ana_para,vade_yili;
        double faiz_orani = 0.06;

        System.out.println("Ana paranız : ");
        ana_para = input.nextInt();

        double toplam_para = ana_para;

        System.out.println("Vade süresi : ");
        vade_yili = input.nextInt();

        for(int i = 1; i <= vade_yili; i++){

            toplam_para = (toplam_para * faiz_orani) + toplam_para;
            System.out.println(i + " . yıl sonu toplam para : " +toplam_para);
        }
    }
}
