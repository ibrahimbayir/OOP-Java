package EXAM2;
import java.util.Scanner;
public class question_2
{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your birth day: ");
            int birthDay = scanner.nextInt();

            System.out.print("Enter your birth month: ");
            int birthMonth = scanner.nextInt();

            System.out.print("Enter your birth year: ");
            int birthYear = scanner.nextInt();

            scanner.close();

            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            int totalDays = 0;

            for (int year = birthYear; year < 2017; year++) {
                totalDays += (isLeapYear(year) ? 366 : 365);
            }

            for (int month = 0; month < birthMonth - 1; month++) {
                totalDays -= daysInMonth[month];
                if (month == 1 && isLeapYear(birthYear)) {
                    totalDays -= 1;
                }
            }

            totalDays -= birthDay;

            for (int month = 0; month < 3; month++) {
                totalDays += daysInMonth[month];
                if (month == 1 && isLeapYear(2017)) {
                    totalDays += 1;
                }
            }

            totalDays += 24;

            System.out.println("Total number of lived days up to April 24, 2017: " + totalDays);
        }

        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        }
    }




