package Conditional;
import java.util.Scanner;
public class coordinateofxy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the x coordinate");
        double x=sc.nextDouble();
        System.out.println("Enter the y coordinate");
        double y=sc.nextDouble();
        if(x>0 && y>0)
            System.out.print("this coordinate lies in 1st quadrant");
        else if(x<0 && y>0)
            System.out.print("this coordinate lies in 2nd quadrant");
        else if(x<0 && y<0)
            System.out.print("this coordinate lies in 3rd quadrant");
        else if(x>0 && y<0)
            System.out.print("this coordinate lies in 4th quadrant");
        else if(x==0 && y>0 || y<0)
            System.out.print("this coordinate lies on y-axis");
        else if(y==0 && x>0 || x<0)
            System.out.print("this coordinate lies on x-axis");
        else if(x==0 && y==0)
            System.out.print("this coordinate lies on origin");

    }
}
