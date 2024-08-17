package EXAM;

public class recursive
{
    public static int recursive(int sayi)
{
       if(sayi<= 1){
           return 1;
       }
           return sayi*recursive(sayi-1);
       }





    public static void main(String[] args)
    {
        System.out.println("Fakötoriyel" + recursive(5));
    }
}
