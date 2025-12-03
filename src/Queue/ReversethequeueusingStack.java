package Queue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReversethequeueusingStack {
    public static void main(String[] args) {
        Queue<Integer> que=new ArrayDeque<>();
        for(int i=0;i<5;i++){
            que.add(i);
        }
        System.out.println(que);
        Stack<Integer> st=new Stack<>();
        while(!que.isEmpty()){
            st.push(que.poll());
        }
        System.out.println(st);
        while(!st.isEmpty()){
            que.add(st.pop());
        }
        System.out.println(que);
    }
}
