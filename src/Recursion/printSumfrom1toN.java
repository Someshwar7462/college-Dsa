package Recursion;
import java.util.*;
public class printSumfrom1toN {
//    public static void Sum(int n,int s){ // method 1
//        if(n==0){
//            System.out.println(s);
//            return;
//        }
//        Sum(n-1,s+n);
//    }
    public static int sum(int n){ //method 2-> sum(n)=n+sum(n-1)
        if(n==1 ||n==0) return n;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
//        //without using recursion
//        int sum=0;
//        for(int i=0;i<=n;i++){
//            sum+=i;
//        }
//        System.out.println(sum);
        //Sum(n,0); //method 1
        System.out.println(sum(n));// method 2
    }
}
