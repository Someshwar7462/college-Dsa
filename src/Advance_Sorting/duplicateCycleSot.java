package Advance_Sorting;

public class duplicateCycleSot {
    public static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        //leetcode 287
        int[] arr={4,8,5,2,3,4,6,7};
        while(true){
            int ele=arr[0];
            if(arr[ele]==ele) {
                System.out.println(ele);
                break;
            }
            swap(0,ele,arr);
        }
    }
}
