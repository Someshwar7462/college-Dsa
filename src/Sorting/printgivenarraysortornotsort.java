package Sorting;

public class printgivenarraysortornotsort {
    public static void main(String[] args) {
        int[] arr = {6,8,9,24,34,0};
        int n=arr.length;
        boolean flag=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        if(flag==true) System.out.println("Sorted array");
        else System.out.println("Unsorted array");
    }
}