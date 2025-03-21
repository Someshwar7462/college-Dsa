package Recursion;
import java.util.*;
public class PrintNto1 {

    public static void Print(int n){
       // tarika 1
        if(n==0) return;//base case
        System.out.println(n);//work
        Print(n-1);//call
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        Print(n);
    }
}
