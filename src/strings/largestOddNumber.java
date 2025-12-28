package strings;

import java.util.Scanner;

public class largestOddNumber {
    public static String OddNumber(String s){
        //if(s.length()==0) return " ";
        for(int i=s.length()-1;i>=0;i--){
            int num=s.charAt(i)-'0';
            if(num%2==1){
                return s.substring(0,i+1);
            }
        }
        return " ";
    }
    public static void main(String[] args) {
        //leetCode 1903
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(OddNumber(s));

    }
}
