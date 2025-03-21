package Sorting;

public class BubbleOptimizedSort {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,1,0,-4,-6};
        int n=arr.length;
        print(arr);
        for(int x=0;x<n-1;x++){
            boolean flag=true;
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=false;
                }
            }
            //check this pass is sorted or not
            if(flag==true) break;
        }
        print(arr);
    }
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
