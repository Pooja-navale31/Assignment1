package Java_Assignment;

public class Leap_Year_Checker {
    public static void main(String[] args) {
        int year = 1900;
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



