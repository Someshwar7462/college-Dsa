package Advance_Sorting;

public class inversionCountMergeSort {
    //related to leetcode 294
    static int count;
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void merge(int[] arr){
        int n=arr.length;
        //base case
        if(n==1) return;
        //creatye two array
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        //coyping
        for(int i=0;i<n/2;i++) a[i]=arr[i];
        for(int i=0;i<n-n/2;i++) b[i]=arr[i+n/2];
        merge(a);
        merge(b);
        //inversion
        inversion(a,b);
        //merge two sorted array
        mergetwosortedarray(a,b,arr);
    }
    public static void mergetwosortedarray(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }
    public static void inversion(int[] a,int[] b){
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                count+=a.length-i;
                j++;
            }
            else i++;
        }
    }
    public static void main(String[] args) {
        //brute force method
//        int[] arr={8,2,5,3,1,4};
//        int count=0;
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length;j++){
//               if(arr[i]>arr[j]) count++;
//            }
//        }
//        System.out.println(count);
        //using merge Sort
        int[] arr={8,2,5,3,1,4};
        merge(arr);
        print(arr);
        System.out.println(count);
    }
}
