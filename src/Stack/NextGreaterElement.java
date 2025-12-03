package Stack;
import java.util.Stack;
import java.util.*;
public class NextGreaterElement {
    public static int[] Next(int[] arr,int n){
        //brute force approach
//        int[] ans=new int[n];
//        ans[n-1]=-1;
//        for(int i=0;i<=n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[j]>arr[i]){
//                    ans[i]=arr[j];
//                    break;
//                }else ans[i]=-1;
//            }
//        }
//        return ans;

        // stack
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<arr[i]){
                st.pop();
            }
            ans[i] =st.isEmpty() ?-1 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        //gfg
        int[] arr={10,5,2,6,7,9,3,45,12};
        int n=arr.length;

       // System.out.println(Arrays.toString(Next(arr,n)));
        System.out.println(Arrays.toString(Next(arr,n)));

    }
}
