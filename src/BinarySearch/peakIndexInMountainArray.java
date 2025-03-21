package BinarySearch;

public class peakIndexInMountainArray {
    public static void main(String[] args) {
        //leetcode=852
        int[] arr={10,20,30,40,90,40,20,10};
        int n=arr.length;
//by linear search
//        for(int i=1;i<n-1;i++){
//            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
//                System.out.println(arr[i]);
//            }
//        }
        int low=0;int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
                ans=mid;
                break;
            }
            else if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]) high=mid-1;
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low=mid+1;
            }
        if(ans!=-1){
        System.out.println("peak is at "+ans);
        }
        else System.out.println("peak is not found");
    }
}
