package Conditional;
import java.util.Scanner;
public class fivedigitnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any number");
        int n=sc.nextInt();
        if(n>9999 && n<100000){
            System.out.println("yes it is five digit number");
        }
        else{
            System.out.println("no it is not five digit number");
        }
    }
}
