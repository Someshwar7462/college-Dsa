package Sorting;

public class SortarrayInDecreasingOrderusingBUbbleSort {
    public static void main(String[] args) {
        int[] arr={4,5,7,1,8,3,4,-4,-56,-12};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=true;
            for(int j=0;j<n-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=false;
                }
            }
            if(flag==true) break;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
