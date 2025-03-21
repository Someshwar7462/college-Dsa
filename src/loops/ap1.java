package loops;
import java.util.Scanner;
public class ap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
//        for(int i=3;i<=3*n+1;i+=3){
//            System.out.println(i);
//        }

        //without using formula
        int a=3;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a+=3;
        }
    }
}
