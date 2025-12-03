package Stack;
import java.util.*;
import java.util.Stack;
public class StockSpanProblem {
    public static void CalculateSpan(int[] price,int n,int[] span) {

        //brute force
//        span[0]=1;
//        for(int i=1;i<n;i++){
//            span[i]=1;
//            for(int j=i-1;j>=0 && price[i]>=price[j];j--){
//                    span[i]++;
//            }
//        }
//    }

        //stack
        Stack<Integer> st=new Stack<>();
        span[0]=1;
        for(int i=1;i<n;i++){
            span[i]=1;
            while(!st.isEmpty() && price[st.peek()]<=price[i]){
                st.pop();
            }
            if(st.isEmpty()) span[i]=i+1;
            else span[i]=i-st.peek();
            st.push(i);
        }
    }
    public static void print(int[] span){
        System.out.println(Arrays.toString(span));
    }
    public static void main(String[] args) {
        int[] price={10,4,5,90,120,80};
        int n=price.length;
        int[] span=new int[n];
        CalculateSpan(price,n,span);
        print(span);
    }
}
