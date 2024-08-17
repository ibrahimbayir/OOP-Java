package EXAM;
import java.util.Scanner;
public class QUESTİON_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of integers : ");
        int n = input.nextInt();

        int []numbers = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter the elements of array : ");
            numbers[i] = input.nextInt();
        }

    }

}
