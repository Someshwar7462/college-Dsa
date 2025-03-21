package Recursion;
import java.util.*;
public class FindHCF {
    public static int GCD(int a,int b){
        if(b%a==0) return a;
       return GCD(b%a,a);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        // method 1 using loop
//        for(int i=Math.min(a,b);i>=1;i--){
//            if(a%i==0 && b%i==0){
//                System.out.println(i);
//                break;
//            }
//        }
        System.out.println(GCD(a,b));

    }
}
