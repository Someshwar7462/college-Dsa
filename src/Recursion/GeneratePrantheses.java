package Recursion;
import java.util.*;
public class GeneratePrantheses {
    public static void printvalidparantheses(int open,int close,String ans,int n){
       if(ans.length()==2*n){
           System.out.println(ans);
           return;
       }
       if(open>close) printvalidparantheses(open,close+1,ans+")",n);
       if(open<n) printvalidparantheses(open+1,close,ans+"(",n);
    }
    public static void main(String[] args) {
        //leetcode =22
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n=sc.nextInt();
        String ans="";
        printvalidparantheses(0,0,ans,n);
    }
}
