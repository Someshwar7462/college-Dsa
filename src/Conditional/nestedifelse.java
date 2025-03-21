package Conditional;
import java.util.Scanner;
public class nestedifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        System.out.println("Enter the third number");
        int num3=sc.nextInt();
        if(num1>num2){
            if(num1>num3)
                System.out.println("first number is largest");
            else//num3>num1
                System.out.println("third number is largest");
        }
        else {//num2>num1
            if (num2 > num3)
                System.out.println("second number is largest");
            else//num3>num2
                System.out.println("third number is largest");
        }
    }
}
