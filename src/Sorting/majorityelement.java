package Sorting;

public class majorityelement {
    public static void main(String[] args) {
        int[] arr={23,5,6,4,3,2,6,6,3,6};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=true;
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag==true) break;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Majority elements is "+arr[n/2]);
    }
}
