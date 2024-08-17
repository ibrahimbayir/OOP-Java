package EXAM;
import java.util.Scanner;
public class question {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Kaç tane tamsayı girilecek?: ");
            int n = scanner.nextInt();

            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("%d. tamsayıyı girin: ", i + 1);
                numbers[i] = scanner.nextInt();
            }

            int max = 0;
            int secondMax = 0;
            int maxPosition = -1;
            int secondMaxPosition = -1;

            for (int i = 0; i < n; i++) {
                if (numbers[i] > max) {
                    secondMax = max;
                    secondMaxPosition = maxPosition;
                    max = numbers[i];
                    maxPosition = i;
                } else if (numbers[i] > secondMax) {
                    secondMax = numbers[i];
                    secondMaxPosition = i;
                }
            }

            System.out.printf("Dizideki ikinci en büyük değerin konumu: %d\n", secondMaxPosition + 1);
        }
    }


