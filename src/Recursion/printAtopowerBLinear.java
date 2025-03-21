package Recursion;
import java.util.*;
public class printAtopowerBLinear {
    public static int pow(int a,int b){
        if(a==0 && b==0){
            System.out.println("it is not defined");
            return -1;
        }
        if(a==1 || b==0) return 1;
        if(b==1) return a;
        return a*pow(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        //without using recursion
//        int ans=1;
//        for(int i=1;i<=b;i++){
//            ans*=a;
//        }
//        System.out.println(ans);
        System.out.println(pow(a,b));
    }
}
