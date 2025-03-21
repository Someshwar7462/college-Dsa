package Conditional;
import java.util.Scanner;
public class threedigitnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any number");
        int n=sc.nextInt();
        if(n>99 && n<=999){
            System.out.print("yes it is three digit number "+n);
        }
        else{
            System.out.print("no it is not three number "+n);
        }
    }
}
