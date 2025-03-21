package Sorting;

public class SelectionSort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={3,5,1,7,-3,-9,0};
        int n=arr.length;
        print(arr);
//        for(int i=0;i<n;i++){
//            if(arr[i]<min){
//                min=arr[i];
//                minidx=i;
//            }
//        }
//        System.out.println(min+" "+minidx);
        for(int i=0;i<n-1;i++){// passes
            int min=Integer.MAX_VALUE;
            int minidx=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minidx=j;
                }
            }
            //swap this min element to its right position
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
        print(arr);
    }
}
