package Arrays;
import java.util.Scanner;
public class searchelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the target");
        int target=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        boolean flag=false;//element is not found
        for(int i=0;i<arr.length;i++){
                if(target==arr[i]){
                    flag=true;
                    break;
                }
        }
        if(flag==true)
            System.out.println("element is found");
        else System.out.println("element is not found");
    }
}
