package Conditional;
import java.util.Scanner;
public class absolutevalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        if(n<0) {
            n = (-n);
            System.out.print("absolute number is " + n);
        }
        else {
            System.out.print("absolute number is " + n);
        }
    }
}
