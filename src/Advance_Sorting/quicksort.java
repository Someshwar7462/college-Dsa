package Advance_Sorting;

public class quicksort {
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[] arr,int lo,int hi){
        int mid=(lo+hi)/2;
        int pivot=arr[mid]; int pivotidx=mid;
        int smallcount=0;
        for(int i=lo;i<=hi;i++){
            if(i==mid) continue;
            if(arr[i]<=pivot) smallcount++;
        }
        int correctidx=lo+smallcount;
        swap(arr,pivotidx,correctidx);
        int i=lo; int j=hi;
        while(i<correctidx && j>correctidx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]> pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctidx;
    }
    public static void quicksort(int[] arr,int lo,int hi){
        //pivot(arr[lo]) ko sahi jagah pe lagana hai
        //and left part me <=pivot aur right part me pivot>
        //base case
        if(lo>=hi) return;
        int idx=partition(arr,lo,hi);
        quicksort(arr,lo,idx-1);
        quicksort(arr,idx+1,hi);
    }
    public static void main(String[] args) {
        int[] arr={4,9,7,1,2,3,6,5,8};
        int n=arr.length;
        print(arr);
        quicksort(arr,0,n-1);
        print(arr);
    }
}
