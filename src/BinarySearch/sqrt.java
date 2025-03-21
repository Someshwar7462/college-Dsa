package BinarySearch;

public class sqrt {
    public static void main(String[] args) {
        //leetcode=69
        int x=12;
        int low=0; int high=x;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid==x){
               ans=mid;
               break;
            }
            else if(mid*mid>x) high=mid-1;
            else if(mid*mid<x) low=mid+1;
        }
        if(ans==0) {
            System.out.println(high);
        }
        else{
            System.out.println(ans);
        }
    }
}
