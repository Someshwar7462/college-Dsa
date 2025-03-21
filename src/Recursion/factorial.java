package Recursion;
import java.util.*;
public class factorial {
    public static int fact(int n){
        if(n==1 || n==0) return 1;//Base case
        int ans=n*fact(n-1);//call itself fact(n-1) is called recursively call with different parameter , we don't call with same parameter
        return ans;
    }
    public static void main(String[] args) {
        //without using recursion
//        int n=5;
//        int fact=1;
//        for(int i=1;i<=n;i++){
//            fact*=i;
//        }
//        System.out.println(fact);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println(fact(n));
       }
}
