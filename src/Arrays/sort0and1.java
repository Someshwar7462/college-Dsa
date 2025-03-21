package Arrays;
//import java.util.Arrays;
class sort{
//    public static void ZerosandOnes(int[] arr){
//        int n=arr.length;
//        int noOfZeros=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0){
//                noOfZeros++;
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(i<noOfZeros){
//                arr[i]=0;
//            }
//            else{
//                arr[i]=1;
//            }
//        }
//    }
    public static void ZerosandOnes(int[] arr){
        int n=arr.length;

        for(int i=0,j=n-1;i<j; i++,j--) {
            if (arr[i] == 0) i++;
            if (arr[j] == 1) j--;
            if(i>j) break;
            if (arr[i] == 1 && arr[j] == 0) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
                 arr[i]=0;
                 arr[j]=1;
            }
        }
    }
}
public class sort0and1 {
    public static void main(String[] args) {
        int[] arr={1,1,0,0,1,0,1,0};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//        sort.ZerosandOnes(arr);
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
   sort.ZerosandOnes(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
