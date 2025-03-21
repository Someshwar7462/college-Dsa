package loops;
import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
       System.out.println("digit are "+count);

//        int count=0;
//        for(int i=1;n!=0;i++){
//            n/=10;
//            count++;
//        }
//        System.out.println("digita are "+count);
    }
}
