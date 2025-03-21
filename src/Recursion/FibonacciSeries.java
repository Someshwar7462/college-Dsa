package Recursion;
import java.util.*;
public class FibonacciSeries {
    public static int fibo(int n){
       if(n==0 ||n==1) return n;
       return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        //leetcode=509
//        without using recursion
//        int a=0; int b=1;
//        int c;
//        System.out.print(a+" "+b);
//        int count=10;
//        for(int i=2;i<count;i++){
//            c=a+b;
//            System.out.print(" "+c+" ");
//            a=b;
//            b=c;
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth fibbonaci term");
        int n=sc.nextInt();
        System.out.println(fibo(n));
    }
}
