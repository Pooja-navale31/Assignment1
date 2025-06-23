package Java_Assignment;

import java.util.Scanner;

public class PrintNum_ForLoop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number till print");
        int a=sc.nextInt();
        for (int i=1;i<=a;i++)
        {
            System.out.println(i);
        }
    }
}
