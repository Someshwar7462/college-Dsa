package Arrays;
import java.util.Arrays;
public class reversethearray {
    public static void main(String[] args) {
        int[] arr={10,20,45,6,7,23,56};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //reverse the array using loop
//        System.out.println("after the reverse");
//        for(int i=arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }

        //reverse the array using swapping
//        int n=arr.length;
//        for(int i=0;i<n/2;i++){
//            int j=n-1-i;//i+j=n-1
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
        //reverse using two pointer through while loop
        int n=arr.length;
        int i=0,j=n-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println();
        System.out.println("After the reverse");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
