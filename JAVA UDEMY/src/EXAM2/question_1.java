package EXAM2;
import java.util.Scanner;
public class question_1
{

        public static void main(String[] args)
        {
            // Prompt the user for input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            scanner.close(); //for closing the scanner object

            // Check if the number is a Fibonacci number
            if (isFibonacci(number))
            {
                System.out.println(number + " is a Fibonacci number.");
            }
            else
            {
                System.out.println(number + " is not a Fibonacci number.");
            }
        }

        public static boolean isFibonacci(int number)
        {
            if (number == 0 || number == 1)
            {
                return true;
            }

            int previous = 0;
            int current = 1;
            while (current < number)
            {
                int next = previous + current;
                previous = current;
                current = next;
            }

            return current == number;
        }
    }


