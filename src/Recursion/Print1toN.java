package Recursion;
import java.util.*;
public class Print1toN {
    //static int n;// globally declare which is used in all method including main also
    public static void print(int n){
        //tarika 1
//        if(n==0) return;
//        print(n-1);
//        System.out.println(n);
                //tarika 2
//        if(n>6) return;//up to 6
//        System.out.println(n);
//        print(n+1);//if n=1 pass from main method
    }
    public static void print1(int x,int n) {

        //tarika 3
        if (x > n) return;
        System.out.println(x);
        print1(x + 1, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        //print(n);//for tarik 1 and 2
        print1(1,n);//for tarika 3
    }
}
