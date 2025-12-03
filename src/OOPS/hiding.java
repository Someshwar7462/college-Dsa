package OOPS;
import java.util.*;
class Account{
    //for data security
    private double balance;
    //method :: public
    public double getbalance(double balance){
      //withdraw money
        boolean ans=validate("Someshwar","Someshwar123");
        //withdraw the money
        if(ans==true) {
            this.balance = this.balance - balance;
            return balance;
        }
        else{
            System.out.println("username or password is invalid try again");
        }
        return 0.45f;
    }
    public void setbalance(double balance){
        //deposit money
       //authentication
        boolean result=validate("Someshwar","Someshwar123");
        if(result==true){
            //deposit the money
            this.balance=this.balance+balance;
            System.out.println("credit to the account");
        }
        else{
            //throw meaningful message to user
            System.out.println("username or password is invalid tyr again");
        }
    }
    private static boolean validate(String userName,String password){
        //for authentication
        return userName.equalsIgnoreCase("Someshwar")
                && password.equals("Someshwar123");

    }

}
public class hiding {
    public static void main(String[] args) {
   Account ac=new Account();
        ac.setbalance(1000.0);
         double ans=ac.getbalance(500.0);
        System.out.println(ans+" Money is withdraw");
    }
}
