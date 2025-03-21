package Conditional;
import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        double l=sc.nextDouble();
        System.out.println("Enter the breadth of rectangle");
        double b=sc.nextDouble();
        double area=l*b;
        double perimeter=2*(l+b);
        if(area>perimeter){
            System.out.println("yes, area is greater than its perimeter");
        }
        else {
            System.out.println("no, area is not greater than its perimeter");
        }
    }
}
