package EXAM;
import java.util.Scanner;
public class different_1
{

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Kullanıcının girdiği sayıları saklamak için bir dizi oluşturuyoruz
            int[] numbers = new int[100];
            int count = 0;

            // Kullanıcı sayı girmeyi bıraktığında döngü sonlanacak
            while (true) {
                System.out.print("Bir sayı girin (çıkmak için 0 girin): ");
                int num = input.nextInt();
                if (num == 0) {
                    break;  // Döngüyü sonlandır
                }
                numbers[count] = num;
                count++;
            }

            if (count < 2) {
                System.out.println("En az 2 sayı girilmeli.");
                return;
            }

            int max1 = numbers[0];   // En büyük sayı
            int max2 = numbers[0];   // İkinci en büyük sayı
            int pos = 0;             // İkinci en büyük sayının pozisyonu

            for (int i = 1; i < count; i++) {
                if (numbers[i] > max1) {
                    max2 = max1;
                    max1 = numbers[i];
                    pos = i;
                } else if (numbers[i] > max2) {
                    max2 = numbers[i];
                }
            }

            System.out.println("İkinci en büyük sayı: " + max2);
            System.out.println("Pozisyon: " + pos);
        }
    }

