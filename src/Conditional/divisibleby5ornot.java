package Conditional;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class divisibleby5ornot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter tha value of n");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.print("Number "+n+" is divisible by 5");
        }
        else{
            System.out.print("Number "+n+" is not divisible by 5");
        }

    }
}
