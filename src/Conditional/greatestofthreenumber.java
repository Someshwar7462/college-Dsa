package Conditional;
import java.util.Scanner;
public class greatestofthreenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        System.out.println("Enter the third number");
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.print("first number is greatest");
        }
        else if(num2>num1 && num2>num3){
            System.out.print("second number is greatest");
        }
        else{
            System.out.print("third number is greatest");
        }
    }
}
