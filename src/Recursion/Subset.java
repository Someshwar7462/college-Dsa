package Recursion;
import java.util.*;
public class Subset {
    static ArrayList<String> arr=new ArrayList<>();//global declare
    public static void printSubset(int i,String s,String ans){
        if(i==s.length()){
            //System.out.println(ans);
            arr.add(ans);
            return;
        }
        char ch=s.charAt(i);
        printSubset(i+1,s,ans+ch);//taking
        printSubset(i+1,s,ans);//not taking
    }
    public static void main(String[] args) {
        //leetcode=78
        String s="abcd";
        String ans="";
        printSubset(0,s,ans);
        //store the ans in arraylist
        //arr=new ArrayList<>();// to reset if global declare,ans due to all test case run in leetcode not on this platform
        System.out.println(arr);
    }
}
