package Recursion;

public class StringTraversal {
    public static void print(String s,int i){
        if(i==s.length()) return;
        System.out.print(s.charAt(i)+" ");
        print(s,i+1);
    }
    public static void main(String[] args) {
        String s="Someshwar";
        print(s,0);
    }
}
