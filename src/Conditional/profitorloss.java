package Conditional;
import java.util.Scanner;
public class profitorloss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost price");
        double cp=sc.nextDouble();
        System.out.println("Enter the selling price");
        double sp=sc.nextDouble();
        if(cp>sp){
            System.out.println("loss is occured");
            System.out.print((cp-sp));
        }
        else if(sp>cp){
            System.out.println("profit is occured");
            System.out.print((sp-cp));
        }
        else{
            System.out.print("neither profit nor loss");
        }
    }
}
