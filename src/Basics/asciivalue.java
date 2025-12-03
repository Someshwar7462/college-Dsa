package Basics;
import java.util.Scanner;
public class asciivalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        System.out.println(ch);
        int x=(int)ch;//explicit typecasting which has loss the data
        System.out.println(x);
        //A=65,a=97,0=48
    }
}
