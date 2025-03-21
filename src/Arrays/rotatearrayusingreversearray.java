package Arrays;
class A{

    public static void reverse(int[] arr,int i,int j){
        //int n=arr.length;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] arr,int k){
        int n= arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

}
public class rotatearrayusingreversearray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int k=5;
        A.rotate(arr,k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
