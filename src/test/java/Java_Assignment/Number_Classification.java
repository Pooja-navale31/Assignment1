package Java_Assignment;

import java.util.Scanner;

public class Number_Classification {
    public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        if (a==0)
        {
            System.out.println("It is Zero");
        } else if (a>0) {
            System.out.println("Its Positive");
        } else if (a<0) {
            System.out.println("Its Negative");

        }
    }
}
