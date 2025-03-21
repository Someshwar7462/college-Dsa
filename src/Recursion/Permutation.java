package Recursion;

public class Permutation {
    public static void printPermutation(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String leftside=s.substring(0,i);
            String rightside=s.substring(i+1);
            printPermutation(leftside+rightside,ans+ch);
        }
    }
    public static void main(String[] args) {
        String s="abcd";
        String ans="";
        printPermutation(s,ans);
    }
}
