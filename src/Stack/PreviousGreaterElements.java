package Stack;
import java.util.*;
import java.util.Stack;
public class PreviousGreaterElements {
    public static int[] Prev(int[] arr,int n){

        //brute force approach
//        int[] ans=new int[n];
//        ans[0]=-1;
//        for(int i=1;i<n;i++){
//            for(int j=i-1;j>=0;j--){
//                if(arr[i]<arr[j]){
//                    ans[i]=arr[j];
//                    break;
//                }
//                else ans[i]=-1;
//            }
//        }
//        return ans;

        //stack approach
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        System.out.println("-1");
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) System.out.println("-1");
            else System.out.println(st.peek()+" ");
            st.push(arr[i]);
        }
          return arr;
    }
    public static void main(String[] args) {
        int[] arr={10,4,2,20,40,12,30};
        int n=arr.length;
        System.out.println(Arrays.toString(Prev(arr,n)));
    }
}
