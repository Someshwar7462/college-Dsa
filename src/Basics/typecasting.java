package Basics;
import java.util.Scanner;
public class typecasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        double d = (double)n/2;
        System.out.println(d);
    }
}
