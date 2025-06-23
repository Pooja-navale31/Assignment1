package Java_Assignment;

public class LargestOf_3Number {
    public static void main(String[] args) {
        int a=15,b=27,c=19;

        if(a>b && a>c)
        {
            System.out.println("Largest " +a);
        } else if (b>a && b>c) {
            System.out.println("Largest "+b);
        }
        else if (c>a && c>b)
        {
            System.out.println("Largest" +c);
        }
    }
}
