import java.util.Scanner;
public class third
{
   public static void finder_odd(int x, int y)
   {
       for (int i = x + 1; i < y; i++)
       {
           if(i % 2 == 1)
               System.out.println(+i);
       }
   }



    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Pleae enter two values for the finding odd numbers between your input : ");
        int x = input.nextInt();
        int y = input.nextInt();
        finder_odd(x,y);
    }
}
