package Arrays;
import static Arrays.doublet.doubletpairs;
class doublet{
    public static void doubletpairs(int[] arr,int target){
        //int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    //count++;
                    System.out.println(i+" "+j);
                }
            }
        }
        //return count;
    }
}
public class doubletpair {
    public static void main(String[] args) {
        int[] arr={4,6,2,3,7,9};
        int target=10;
        doubletpairs(arr,target);
        //System.out.println(ans);
    }
}
