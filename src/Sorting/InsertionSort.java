package Sorting;

public class InsertionSort {
    public static void Swap(int[] arr,int j,int s){
        int temp=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,1,0,-4,-6};
        int n=arr.length;
        for(int i=1;i<n;i++){//passes
//            for(int j=i;j>=1;j--){
//                if(arr[j]<arr[j-1]){
//                    Swap(arr,j,j-1);
//                }
//                else break;
//            }
               int j=i;
            while(j>=1 && arr[j]<arr[j-1]){
                    Swap(arr,j,j-1);
                    j--;
            }
        }
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
    }
}
