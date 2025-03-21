package Basics;
import java.util.Scanner;
public class inputnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print("Sum of the a and b is: "+sum);
    }
}
