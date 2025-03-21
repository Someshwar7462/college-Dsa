package Recursion;
import java.util.*;
public class BinaryString {
    public static void printBinaryString(String ans,int n){
        int m=ans.length();
        if(m==n){
            System.out.println(ans);
            return;
        }

        //if we want all terms
//        printBinaryString(ans+"0",n);
//        printBinaryString(ans+"1",n);

        //skip the cosecutive i's
        if(m==0 || ans.charAt(m-1)=='0'){
            printBinaryString(ans+"0",n);
            printBinaryString(ans+"1",n);
        }
        else printBinaryString(ans+"0",n);

//        skip the consecutive 0's
//        if(m==0 || ans.charAt(m-1)=='1'){
//            printBinaryString(ans+"0",n);
//            printBinaryString(ans+"1",n);
//        }
//        else printBinaryString(ans+"1",n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        String ans="";
        printBinaryString(ans,n);
    }
}
