package Sorting;

public class pushzerosatendandmaintainrelativeorderofotherelements {
    public static void main(String[] args) {
        int[] arr={1,0,4,0,2,-40,100,0,5};
        //leetcode-283
        int n=arr.length;
        int idx=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                ans[idx++]=arr[i];
            }
        }
        //print the output
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
