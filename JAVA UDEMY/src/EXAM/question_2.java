package EXAM;
import java.util.Scanner;
public class question_2
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            int n = scanner.nextInt();

            int sum = calculateSum(n);

            System.out.printf("The sum of digits of %d is %d\n", n, sum);
        }

        // we used function
        public static int calculateSum(int n) {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit;
                n /= 10;
            }

            return sum;
        }
    }


