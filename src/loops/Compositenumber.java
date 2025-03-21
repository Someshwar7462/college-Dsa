package loops;
import java.util.Scanner;
public class Compositenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        //composite number-> if number has more than two factors bcz every number has two factor ist itself and other is 1
        int a = 0;//0 means prime number
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("it is composite number");
                a=1;//1 means composite number
                break;
            }
        }
        if(n==1)
            System.out.println("neither prime nor composite number");
        else if(a==0)
        System.out.println("it is prime number");
    }
}
