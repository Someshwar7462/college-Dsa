package loops;
import java.util.Scanner;
public class gp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n terms");
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a*=2;
        }

        // other problem
        int b=3;
        for(int i=1;i<=n;i++){
            System.out.println(b);
            b*=4;
        }
    }
}
