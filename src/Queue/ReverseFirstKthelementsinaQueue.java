package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseFirstKthelementsinaQueue {
    public static Queue<Integer> reversequeue(Queue<Integer> que,int k){
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=k;i++){
            st.push(que.remove());
        }
        while(!st.isEmpty()){
            que.add(st.pop());
        }
        for(int i=1;i<=que.size()-k;i++){
            que.add(que.remove());
        }

        return que;
    }
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(reversequeue(que,3));
    }
}
