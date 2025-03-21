package loops;
import java.util.Scanner;
public class printallevennumberupto100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //either divisible by 3 or 5
//        for(int i=1;i<=n;i++){
//            if(i%3==0 || i%5==0){
//                System.out.println(i);
//            }
//        }

        //another way to print even number up to 100
        //for(int i=2;i<=100;i+=2){
        //s.out.p(i);
    }
}
