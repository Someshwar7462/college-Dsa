package BinarySearch;

public class findUpperBound {
    public static void main(String[] args) {
        //upper bound=if target is exist then index of the target next element
        //if duplicate target is exist then index of the target(last occurence) next element
        //if target is not exist in array then index of next largest target
        int[] arr={10,20,30,30,30,40,50,55,60};
        int n=arr.length;
        int target=30;
        int ub=n;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){//condition for upper bound
                ub=Math.min(ub,mid);
                high=mid-1;
            }
            else low=mid+1;
        }
        System.out.println(ub);
    }
}
