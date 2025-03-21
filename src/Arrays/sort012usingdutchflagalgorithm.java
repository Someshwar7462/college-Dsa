package Arrays;
class dutchflag{
    public static void swap(int[] arr,int mid,int low){
        int temp=arr[mid];
        arr[mid] = arr[low];
        arr[low]=temp;
    }
    public static void dutchalgo(int[] arr){
        int n=arr.length;
        int mid=0,low=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
               swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else{
                swap(arr,mid,high);
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class sort012usingdutchflagalgorithm {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,1,2,0,0};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        dutchflag.dutchalgo(arr);

    }
}
