package Arrays;
class sort1{
    public static void sort01and2(int[] arr){
        int n=arr.length;
        int noOfZeros=0,noOfOnes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                noOfZeros++;
            }
            if(arr[i]==1){
                noOfOnes++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<noOfZeros){
                arr[i]=0;
            }
            else if(i<noOfZeros+noOfOnes){
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class sort012 {
    public static void main(String[] args) {
        int[] arr={0,2,1,0,1,2,0,1,1,2,2};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sort1.sort01and2(arr);
    }
}
