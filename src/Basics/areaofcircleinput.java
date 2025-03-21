package Basics;
import java.util.Scanner;
public class areaofcircleinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of radius");
        double r=sc.nextDouble();
        double a=3.14*r*r;
        System.out.println("Area of circle is :"+a);
    }
}
