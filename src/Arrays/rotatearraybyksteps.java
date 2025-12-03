package Arrays;

public class rotatearraybyksteps {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int[] ans=new int[n];
        int k=3;
        k=k%n;
        for(int i=n-k,j=0;i<n;i++,j++){
            ans[j]=arr[i];
        }
        int x=n-1;
        for(int i=n-k-1;i>=0;i--){
            ans[x]=arr[i];
            x--;
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
