package Advance_Sorting;

import java.util.ArrayList;

public class findmissingnumbercycleSort {
    public static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        //leetode 448
        int[] arr={4,3,2,7,8,2,3,1};
        int n=arr.length;
        //ans ko arraylist em store karna hai
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        while(i<n){
            int ele=arr[i];
            if(arr[i]==i+1 ||arr[i]==arr[ele-1])
                i++;
            else {
                swap(i,ele-1,arr);
            }
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i+1) ans.add(i+1);
        }
        System.out.println(ans);
    }
}
