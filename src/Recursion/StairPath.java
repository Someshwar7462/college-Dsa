package Recursion;
import java.util.*;
public class StairPath {
    public static int stair(int n){
        if(n==1 ||n==0||n==2) return n;
        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter then total number of stairs");
        int n=sc.nextInt();
        System.out.println("Number of ways to reach the nth stair if 1 or 2 jump is allowed "+stair(n));
    }
}
