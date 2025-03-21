package Sorting;

public class Bubblesort2 {
    public static void main(String[] args) {
        int[] arr={-3,9,3,2,1,0,-45,-34};
        int n=arr.length;
        //Bubblesort 2
        print(arr);
        for(int x=0;x<n-1;x++){//n-1 pass for n size of array
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        print(arr);
    }
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
