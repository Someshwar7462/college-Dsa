package Sorting;

public class transformelements {
    public static void print(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={3,5,6,2,8,99,55,22};
        //     ans=1,2,3,0,4,7,6,5
        int n=arr.length;
        print(arr,n);
        int x=0;
        for(int i=1;i<=n;i++){
            int min=Integer.MAX_VALUE;
            int minidx=-1;
            for(int j=0;j<n;j++){
                if(arr[j]<min && arr[j]>0){
                    min=arr[j];
                    minidx=j;
                }
            }
            arr[minidx]=x;
            x--;
        }
        print(arr,n);
        for(int i=0;i<n;i++){
            arr[i]*=-1;
        }
        print(arr,n);
    }
}
