package EXAM2;
import java.util.Scanner;
public class sdd
{



        public static void main(String[] args) {
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your birth day: ");
            int birthDay = scanner.nextInt();

            System.out.print("Enter your birth month: ");
            int birthMonth = scanner.nextInt();

            System.out.print("Enter your birth year: ");
            int birthYear = scanner.nextInt();


            System.out.print("Enter the current day: ");
            int currentDay = scanner.nextInt();

            System.out.print("Enter the current month: ");
            int currentMonth = scanner.nextInt();

            System.out.print("Enter the current year: ");
            int currentYear = scanner.nextInt();

            int livedDays = calculateLivedDays(birthDay, birthMonth, birthYear, currentDay, currentMonth, currentYear, daysInMonth);

            System.out.println("You have lived for " + livedDays + " days.");
        }

        public static int calculateLivedDays(int birthDay, int birthMonth, int birthYear, int currentDay, int currentMonth, int currentYear, int[] daysInMonth) {
            int livedDays = 0;

            for (int year = birthYear + 1; year < currentYear; year++) {
                livedDays += isLeapYear(year) ? 366 : 365;
            }


            for (int month = birthMonth - 1; month < 12; month++) {
                if (month == birthMonth - 1) {
                    livedDays += daysInMonth[month] - birthDay + 1;
                } else {
                    livedDays += daysInMonth[month];
                }
            }


            for (int month = 0; month < currentMonth - 1; month++) {
                if (month == currentMonth - 2) {
                    livedDays += currentDay;
                } else {
                    livedDays += daysInMonth[month];
                }
            }

            return livedDays;
        }

        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }

