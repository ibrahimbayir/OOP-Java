import java.util.Scanner;

public class first
{
    public static void circle(int r)
    {
        double area1, pi = 3.14;
        double area_1 = pi * r * r;
        System.out.println("The area of the circle : "+area_1);
    }

    public static void rectangle(int long_side,int short_side)
    {
        int area_2 = short_side * long_side;
        System.out.println("The area of the rectangle : "+area_2);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("this program finds to area of renctangle or circle ");
        System.out.println("İf you want to find area of rectangle press 1 or for circle press 2");
        int islem = input.nextInt();

        if(islem == 1){
            System.out.println("Please enter the r value : ");
            int r = input.nextInt();
            circle(r);
        }
        else if (islem == 2) {
            System.out.println("Please enter the short side first, and then long side of rectangle : ");
            int short_side = input.nextInt();
            int long_side = input.nextInt();
            rectangle(short_side,long_side);
        }
        else
            System.out.println("Yanlış bir tuşlama yaptınız...");

    }
}