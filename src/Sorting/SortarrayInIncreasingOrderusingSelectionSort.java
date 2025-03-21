package Sorting;

public class SortarrayInIncreasingOrderusingSelectionSort {
    public static void main(String[] args) {
        //but kth largest element put at last position of sorted array
        int[] arr={3,6,7,0,-3,-78,-12,90,34,67};
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            int max=Integer.MIN_VALUE;
            int maxidx=-1;
            for(int j=i;j>=0;j--){
                if(max<arr[j]){
                    max=arr[j];
                    maxidx=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[maxidx];
            arr[maxidx]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
