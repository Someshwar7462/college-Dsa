package Sorting;

public class Bubblesort1 {
    public static void main(String[] args) {
        int[] arr={-3,0,-5,7,3,2,9,-89};
        int n=arr.length;
        print(arr);
        //Bubble sort 1
        for(int x=1;x<=n-1;x++){//n-1 pass for n size of array
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        //print sorted array
        print(arr);
    }
    public static void print(int[] arr){
        for(int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
