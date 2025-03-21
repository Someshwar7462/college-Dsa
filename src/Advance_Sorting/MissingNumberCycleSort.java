package Advance_Sorting;

public class MissingNumberCycleSort {
    public static void swap(int i,int j,int[] arr){
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
    }
    public static void main(String[] args) {
        //leetcode 268
        int[] arr={7,4,5,1,6,2,0};
        int n=arr.length;
//        //method 1 using an extra array
//        boolean[] b=new boolean[n+1];
//        for(int ele:arr){
//            b[ele]=true;
//        }
//        for(int i=0;i<=n;i++){
//            if(b[i]==false)
//                System.out.println(i);
//        }
//        //method 2 using cycle sort
        int i=0;
        while(i<n){
            if(arr[i]==i || arr[i]==n) i++;
            else {
                swap(i,arr[i],arr);
            }
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i) System.out.println(i);
        }
        //method 3 using maths
//        int sum=0;
//        for(int i=0;i<n;i++){
//            sum+=arr[i];
//        }
//        int sum1=n*(n+1)/2;
//        int ans=sum1-sum;
//        System.out.println(ans);
    }
}
