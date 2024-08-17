package EXAM;
import java.util.Scanner;
public class question_3
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            int n = scanner.nextInt();

            int oddCount = 0;
            int evenCount = 0;

            while (n > 0) {
                int digit = n % 10;
                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                n /= 10;
            }

            System.out.printf("Number of odd digits: %d\n", oddCount);
            System.out.printf("Number of even digits: %d\n", evenCount);
        }
    }


