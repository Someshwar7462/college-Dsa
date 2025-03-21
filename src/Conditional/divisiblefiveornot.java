package Conditional;
import java.util.Scanner;
public class divisiblefiveornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any number");
        int n=sc.nextInt();
        if(n%5==0 || n%3==0){
            System.out.print("yes number n is divisible by 5 or 3");
        }
        else{
            System.out.print("no number n is not divisible by 5 or 3");
        }
    }
}
