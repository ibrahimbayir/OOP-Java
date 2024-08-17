import java.util.Scanner;
public class fourth
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int Arr[] = new int[10];
        int toplam = 0,ortalama;
        System.out.println("Please enter the values of array : ");

     for(int i = 0; i < 10; i++)
     {
            Arr[i] = input.nextInt();
            toplam = toplam + Arr[i];
     }

     int enBuyuk = Arr[0];

     for(int i = 0; i < 10; i++)
     {
        if(Arr[i] > enBuyuk)
        {
            enBuyuk = Arr[i];
        }

        //ORTALAMA VE EN BÜYÜĞÜNÜ BULDURAN PROGRAMI YAZMAYA ÇALIŞIYORU

    }
        ortalama = toplam /2;
        System.out.println("Ortalama : "+ortalama);
        System.out.println("En büyük değer : "+enBuyuk);
}

    }
