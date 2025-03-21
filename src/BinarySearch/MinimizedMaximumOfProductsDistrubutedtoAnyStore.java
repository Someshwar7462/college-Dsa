package BinarySearch;

public class MinimizedMaximumOfProductsDistrubutedtoAnyStore{
    public static boolean IsPossible(int minQ,int[] arr,int n){
        int store=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%minQ==0) store+=arr[i]/minQ;
            else store+=arr[i]/minQ+1;
        }
        if(store>n) return false;
        return true;
    }
    public static void main(String[] args) {
        //int[] arr={15,10,10};//three different item has some quantity
        int[] arr={15,12,10};
        int m=arr.length;
        int mx=Integer.MIN_VALUE;
        int n=7;//number of shops
        for(int i=0;i<m;i++){
            mx=Math.max(mx,arr[i]);
        }
        int low=1; int high=mx;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(IsPossible(mid,arr,n)==true){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        System.out.println(ans);
    }
}
