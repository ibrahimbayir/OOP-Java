package UDEMY_METHODS;
import java.util.Scanner;
public class arrays
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n,i,max=0;

        System.out.println("Please enter the size of array : ");
        n = input.nextInt();
        int[] numbers = new int[n];

        for (i = 0; i < n; i++)
        {
            System.out.println("Please enter the elements of array : ");
            numbers[i] = input.nextInt();
        }

        for (i = 0; i < n; i++){
           if(numbers[i] > max){
               max = numbers[i];
           }
        }
        System.out.println("THE max value is " + max);
    }
}
