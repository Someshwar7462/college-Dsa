package BinarySearch;

public class KthMissingPositiveInteger {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        int n=arr.length;
        int k=5;//print 5th missing integer
        int low=0;int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missed=arr[mid]-(mid+1);
            if(missed<k){
                low=mid+1;
            }
            else high=mid-1;
        }
        System.out.println(k+(high+1));
    }
}
