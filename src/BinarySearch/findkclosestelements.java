package BinarySearch;
import java.util.*;
public class findkclosestelements {
    public static void main(String[] args) {
        //leetcode=658
        int[] arr={1,2,4,5,6,8,9};
        int n=arr.length;
        int x=7;
        int k=3;
        ArrayList<Integer> ans=new ArrayList<>();
        //if x < arr[0]  //base case 1
        if(x<arr[0]){
            for(int i=0;i<k;i++){
              ans.add(arr[i]);
            }
        }
        //if x > arr[n-1] //base case 2
        if(x>arr[n-1]){
            for(int i=n-1;i>n-k;i--){
                ans.add(arr[i]);
            }
            Collections.sort(ans);
        }
        int lb=n;
        int low=0; int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                lb=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        //now when x is present in array then using two pointer
        int j=lb; int i=lb-1;
        while(k>0 && i>=0 && j<n){
            int di=Math.abs(x-arr[i]);
            int dj=Math.abs(x-arr[j]);
            if(di<=dj){
                ans.add(arr[i]);
                i--;
            }
            else{
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        while(i<0 && k>0){
            ans.add(arr[j]);
            j++;
            k--;
        }
        while(j==n && k>0){
            ans.add(arr[i]);
            i--;
            k--;
        }
        Collections.sort(ans);
        System.out.println(ans);
    }
}
