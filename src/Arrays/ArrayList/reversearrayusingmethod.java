package Arrays.ArrayList;
class A{
    public static void reverse(int[] arr){
        int n=arr.length;
        for(int i=0,j=n-1;i<=j;i++,j--){//we can reverse the part of array using this concept
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class reversearrayusingmethod {
    public static void main(String[] args) {
        int[] arr={10,23,4,5,12};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        A.reverse(arr);
    }
}
