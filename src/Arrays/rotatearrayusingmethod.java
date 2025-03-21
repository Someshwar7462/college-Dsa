package Arrays;
class rotate{
    public static void rotatearray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] ans=new int[n];
        for(int i=n-k,j=0;i<n;i++,j++){
            ans[j]=arr[i];
        }
        int x=n-1;
        for(int i=n-k-1;i>=0;i--){
            ans[x]=arr[i];
            x--;
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
public class rotatearrayusingmethod {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int k=9;
        rotate.rotatearray(arr,k);
    }
}
