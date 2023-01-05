import java.util.Scanner;

public class scanner {
    public static void main(String [] args ) throws Exception
    {
        System.out.println("SUM Finder");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter Num 2 : ");
        int b = sc.nextInt();
        System.out.println("The sum of "+  a + " + " + b + " is " + (a+b));
        sc.close();
    }

    }
