package Arrays;

public class nextGreatestElementinArray {
    public static void main(String[] args) {
        int[] arr={12,8,41,37,2,49,16,28,21};
        int n=arr.length;
        int[] ans=new int[n];
        ans[n-1]=-1;
        // method 1:->Brute force
//        for(int i=0;i<n-1;i++){
//            int mx=Integer.MIN_VALUE;
//            for(int j=i+1;j<n;j++){
//                if(arr[j]>mx){
//                    mx=arr[j];
//                }
//            }
//            ans[i]=mx;
//        }
        //method 2:-> optimize solution
        int cge=arr[n-2];
        for(int i=n-2;i>=0;i--){
            ans[i]=cge;
            cge=Math.max(cge,arr[i]);//to find the max element in array
        }

        //print ouput
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
