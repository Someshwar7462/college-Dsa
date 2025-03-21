package BinarySearch;

public class findLowerBound {
    public static void main(String[] args) {
        //lower bound=if target is exist then index of the target
        //if duplicate target is exist then first occurence of target's index
        //if target is not exist in array then index of next largest target
        int[] arr={10,20,30,30,30,40,50,55,60};
        int n=arr.length;
        int target=41;
        int lb=n;
        //boolean flag=true;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target) {//condition for lower bound
                lb=Math.min(lb,mid);
                high = mid - 1;
            }
            else{
                low =mid+1;
            }
        }
        System.out.println(lb);
    }
}
