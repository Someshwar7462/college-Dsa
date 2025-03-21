package Arrays;
class reverse{
    public static void partreverse(int[] arr){
        int n=arr.length;
        for(int i=1,j=4;i<=j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class reversepartofarray {
    public static void main(String[] args) {
        int[] arr={11,34,5,6,23,78};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        reverse.partreverse(arr);

    }

}
