package HashMapAndHashSet;

import java.util.HashMap;

public class TwoSum {
    public static int[] Sum(int[] arr, int target){
        int[] ans={-1,-1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int remaining=target-arr[i];
            if(map.containsKey(remaining)){
                int j=map.get(remaining);
                ans[0]=j;
                ans[1]=i;
            }
             else map.put(arr[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        //LeetCode:1
        int[] arr={3,5,6,2,8,10};
        int target=16;
        int[] ans=Sum(arr,target);
        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }
}
