package Conditional;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first operand");
        int op1=sc.nextInt();
        System.out.println("Enter the second operand");
        int op2=sc.nextInt();
        System.out.println("Enter the operator");
        char operator=sc.next().charAt(0);
        //without using switch case
//        if(operator=='+')
//            System.out.println(op1+op2);
//        if(operator=='-')
//            System.out.println(op1-op2);
//        if(operator=='*')
//            System.out.println(op1*op2);
//        if(operator=='/')
//            System.out.println(op1/op2);
        switch(operator){
            case '+':
                System.out.println(op1+op2);
                break;
            case '-':
                System.out.println(op1-op2);
                break;
            case '*':
                System.out.println(op1*op2);
                break;
            case '/':
                System.out.println(op1/op2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
