package Conditional;
import java.util.Scanner;
public class istrangleornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first side");
        int s1=sc.nextInt();
        System.out.println("Enter the second side");
        int s2=sc.nextInt();
        System.out.println("Enter the third side");
        int s3=sc.nextInt();
        if((s1+s2)>s3 && (s2+s3)>s1 && (s3+s1)>s2)
            System.out.println("triangle is possible");
        else
            System.out.println("triangle is not possible");
    }
}
