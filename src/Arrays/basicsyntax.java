package Arrays;
import java.util.Scanner;
public class basicsyntax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr;//decleration
        arr=new int[5];//memory allocation
        //intilising the array using index number
        arr[0]=8;
        arr[1]=5;
        arr[2]=7;
        arr[3]=3;
        arr[4]=9;
        //output
        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");
        System.out.print(arr[2]+" ");
        System.out.print(arr[3]+" ");
        System.out.print(arr[4]+" ");
    }
}
