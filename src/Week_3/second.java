import java.util.Scanner;
public class second
{

   public static void daysFinder(int x){
       if(x == 1){
           System.out.println("Sunday");
       }
       else if (x == 2) {
           System.out.println("Monday");
       }
       else if (x == 3) {
           System.out.println("Tuesday");
       }
       else if (x == 4) {
           System.out.println("Wednesday");
       }
       else if (x == 5) {
           System.out.println("Thursday");
       }
       else if (x == 6) {
           System.out.println("Friday");
       }
       else if (x == 7) {
           System.out.println("Saturday");
       }
   }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number betwwen (1-7) : ");
        int x = input.nextInt();
        daysFinder(x);

    }
}

/*

    public static void daysFinder(int x) {
        String day;
        switch (x) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day number";
                break;
        }
        System.out.println(day);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between (1-7) : ");
        int x = input.nextInt();
        daysFinder(x);
    }
}

  */
