import java.util.Scanner;
public class fifth
{
    public static void avg(int array[]){
        int total = 0;
        for (int i : array){
            total+=i;
        }
        int avg = total / array.length;
        int max = array[0];

        for(int i = 0; i< array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("total : "+total);
        System.out.println("Average number : "+avg);
        System.out.println("Max number : "+max);
    }



    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        int num;
        System.out.println("Please enter the 5 number for array : ");

        for (int i = 0; i<5; i++){
            num = input.nextInt();
            arr[i] = num;
        }
        avg(arr);
    }
}
