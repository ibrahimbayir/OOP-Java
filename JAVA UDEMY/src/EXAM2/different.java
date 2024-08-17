package EXAM2;
import java.util.Scanner;
public class different
{



        public static void main(String[] args) {
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int todayDay = 24;
            int todayMonth = 4;
            int todayYear = 2017;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your birth day: ");
            int birthDay = scanner.nextInt();
            System.out.print("Enter your birth month: ");
            int birthMonth = scanner.nextInt();
            System.out.print("Enter your birth year: ");
            int birthYear = scanner.nextInt();

            int livedDays = 0;

            for (int year = birthYear; year <= todayYear; year++) {
                for (int month = 1; month <= 12; month++) {
                    if (year == birthYear && month < birthMonth) {
                        continue;
                    }
                    if (year == todayYear && month > todayMonth) {
                        break;
                    }
                    if (year == birthYear && month == birthMonth) {
                        livedDays += daysInMonth[month - 1] - birthDay;
                    } else if (year == todayYear && month == todayMonth) {
                        livedDays += todayDay;
                    } else {
                        livedDays += daysInMonth[month - 1];
                    }
                }
            }

            System.out.println("Total number of lived days: " + livedDays);
        }
    }

