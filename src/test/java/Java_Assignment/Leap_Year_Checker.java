package Java_Assignment;

import java.util.Scanner;

public class Leap_Year_Checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int year=sc.nextInt();
        boolean isLeapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println(year + "  leap year.");
        } else {
            System.out.println(year + "  not a leap year.");
        }
    }
}



