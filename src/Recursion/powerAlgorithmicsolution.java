package Recursion;
import java.util.*;
public class powerAlgorithmicsolution {
    public static int pow(int a,int b){
        if(a==0 && b==0) {
            System.out.println("it is not defined");
            return -1;
        }
        if(b==0) return 1;
        if(b==1) return a;
        int ans=pow(a,b/2);
        if(b%2==0){
            return ans*ans;
        }
        return ans*ans*a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        System.out.println(pow(a,b));
    }
}
