package Advance_Sorting;
import java.util.*;
public class FirstMissingPositiveElement {
    public static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        //leetcode 41
        int[] arr={2,0,1,3};
        int n=arr.length;
        //brute force method but it takes o(n^2) time complexity
//        for(int i=1;i<=n+1;i++){
//            boolean flag=false;
//            for(int j=0;j<n;j++){
//                if(arr[j]==i){
//                    flag=true;
//                    break;
//                }
//            }
//            if(flag==false)
//                System.out.println(i);
//        }
//        //by hashset
//        HashSet<Integer> set=new HashSet<>();
//        for(int i=0;i<n;i++){
//            set.add(i);
//        }
//        for(int i=1;i<=n+1;i++){
//            if(!set.contains(i)) System.out.println(i);
//        }
        //by cycle sort
        int i=0;
        while(i<n){
            int ele=arr[i];
            if(arr[i]<=0 || arr[i]>n || arr[i]==arr[ele-1] || arr[i]==i+1) i++;
            else swap(i,ele-1,arr);
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i+1) System.out.println(i+1);
        }
    }
}
