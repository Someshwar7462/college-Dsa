package Recursion;
import java.util.*;
public class countandsay {
    public static String countAndsay(int n,String ans){
        if(n==1) return "1";
        String s=countAndsay(n-1,ans);
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int len=j-i;
                ans+=len;
                ans+=s.charAt(i);
                i=j;
            }
        }
        int len=j-i;
        ans+=len;
        ans+=s.charAt(i);
        return ans;
    }
    public static void main(String[] args) {
        //leetcode =38
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n=sc.nextInt();
        System.out.println(countAndsay(n,""));
    }
}
