package Arrays;
import java.util.Scanner;
public class inputoutputuwsingloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("output array");
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
