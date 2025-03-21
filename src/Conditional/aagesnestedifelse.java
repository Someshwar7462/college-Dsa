package Conditional;
import java.util.Scanner;
public class aagesnestedifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ram_age");
        int ram_age=sc.nextInt();
        System.out.println("Enter the shyam_age");
        int shyam_age=sc.nextInt();
        System.out.println("Enter the ajay_age");
        int ajay_age=sc.nextInt();
        if(ram_age<shyam_age){
            if(ram_age<ajay_age)
                System.out.println("ram is youngest");
            else//ram_age>ajay_age
                System.out.println("ajay is youngest");
        }
        else{//ram_age>shyam_age
            if(shyam_age<ajay_age)
                System.out.println("shyam is youngest");
            else//shyam_age>ajay_age
                System.out.println("ajay is youngest");
        }
    }
}
