package BinarySearch;

public class findSmallestDivisorGivenaThreshold {
    public static void main(String[] args) {
        //leetcode=1283
        int[] arr={5,1,9,2,6,3};
        int th=6;
        int n=arr.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,arr[i]);
        }
//        int d;
//        for(d=1;d<=mx;d++){
//            int sum=0;
//            for(int i=0;i<n;i++){
//                if(arr[i]%d==0) sum+=arr[i]/d;
//                else sum+=arr[i]/d+1;
//            }
//            if(sum<=th) System.out.println(d);
//        }
//        //this type of code is show the time limit exceed on leetcode
        int d=1;
        int low=1; int high=mx;
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0;
            for(int i=0;i<n;i++){
                if(arr[i]%mid==0) sum+=arr[i]/mid;
                else sum+=arr[i]/mid+1;
            }
            if(sum<=th){
                d=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        System.out.println(d);
    }
}
