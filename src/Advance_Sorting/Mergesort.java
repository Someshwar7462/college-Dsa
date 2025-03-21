package Advance_Sorting;
import java.util.*;
public class Mergesort {
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
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
    public static void merge(int[] arr){
        int n=arr.length;
        //base case
        if(n==1) return;
        //dive into two array
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        //copy paste
        for(int i=0;i<n/2;i++) a[i]=arr[i];
        for(int i=0;i<n-n/2;i++) b[i]=arr[i+n/2];
        //magic-> recursion
        merge(a);
        merge(b);
        //merge two sorted array
        mergetwosortedarray(a,b,arr);
        //to delete the last process to minimize space complexiciy
        a=null;b=null;
    }
    public static void main(String[] args) {
        //input array suing keyboard
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        System.out.print("Enter the array elements :");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
        int[] arr={10,11,2,80,5,0,50,96,47};
        merge(arr);
        print(arr);
    }
}
