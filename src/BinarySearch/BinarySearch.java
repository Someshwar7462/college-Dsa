package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        //leetcode=704
        int[] arr={10,23,46,89,91,97,107,140,264};
        int n=arr.length;
        int target=46;
        int low=0;
        int high=n-1;
        int ans=-1;
        boolean flag=false;//false means elements is not present
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;
            else{
                ans=mid;
                flag=true;
                break;
            }
        }
        if(flag==false) System.out.println("Element is not present");
        else System.out.println("Element is present");
        System.out.println(ans);
    }
}
