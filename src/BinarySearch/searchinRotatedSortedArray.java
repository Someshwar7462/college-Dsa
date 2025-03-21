package BinarySearch;

public class searchinRotatedSortedArray {
    public static void binarysearch(int[] arr,int low,int high,int target){
        int ans1=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans1=mid;
                break;
            }
            else if(arr[mid]>target) high=mid-1;
            else low=mid+1;
        }
        System.out.println(ans1);
    }
    public static void main(String[] args) {
        //leetcode=33
    int[] arr={3,4,5,6,7,0,1,2};
    int n=arr.length;
    int target=0;
    int ans=0;

//    linear search
//        for(int i=0;i<n;i++){
//            if(arr[i]==target){
//                ans=i;
//            }
//        }
//        System.out.println(ans);
        //binary linear search
        //step 1:find the pivot element
        int low=0; int high=n-1;
        int pivot=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                pivot=mid;
                break;
            }
            else if(arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1]){
                pivot=mid-1;
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                if(arr[mid]>arr[n-1]){
                    low=mid+1;
                }
                else high=mid-1;
            }

        }
//        //step 2:due to this pivot element array is divided into two sorted part and apply b.s to each part
//        //b.s from 0 to pivot element
//        low=0;high=pivot;
//        while(low<=high){
//            int mid=low+(high-low)/2;
//            if(arr[mid]==target){
//                ans=mid;
//                break;
//            }
//            else if(arr[mid]>target) high=mid-1;
//            else low=mid+1;
//        }
//        //step 3:b.s from pivot+1 to n-1;
//        low=pivot+1;high=n-1;
//        while(low<=high){
//            int mid=low+(high-low)/2;
//            if(arr[mid]==target){
//                ans=mid;
//                break;
//            }
//            else if(arr[mid]>target) high=mid-1;
//            else low=mid+1;
//        }
//        System.out.println(ans);
       binarysearch(arr,0,pivot,target);
       binarysearch(arr,pivot+1,n-1,target);

        //without finding pivot element
//        while(low<=high){
//            int mid=(low+high);
//            if(arr[mid]==target) {
//                ans=mid;
//                break;
//            }
//            else if(arr[mid]<=arr[high]){//target is in right side sorted array
//                if(arr[mid]<=target && arr[high]>=target) low=mid+1;
//                else high=mid-1;
//            }
//            else if(arr[mid]>arr[high]){////target is in left side sorted array
//                if(arr[low]<=target && arr[mid]>=arr[high]) high=mid-1;
//                else low=mid+1;
//            }
//        }
//        System.out.println(ans);
    }
}
