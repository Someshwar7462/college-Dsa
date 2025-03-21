package Recursion;
import java.util.*;
public class printzigzag {
    public static void zigzag(int n){
       if(n==0) return;
       System.out.print(n+" ");//pre
       zigzag((n-1));
       System.out.print(n+" ");//in
       zigzag((n-1));
       System.out.print(n+" ");//post
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        zigzag(n);
    }
}
