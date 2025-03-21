package Conditional;
import java.util.Scanner;
public class gradeofstudent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the percentage of student(0-100)");
        int p=sc.nextInt();
        if(p>=81 && p<=100)
            System.out.print("very good students");
        else if(p>=61 && p<=80)
            System.out.print("good students");
        else if(p>=41 && p<=60)
            System.out.print("Average students");
        else
            System.out.print("fail students");
    }
}
