package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleavetheFirstHalfoftheQueuewithSecondHalf {
    public static Queue<Integer> reorderQueue(Queue<Integer> q){
        int n=q.size();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n/2;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i=0;i<n/2;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }
        while(q.size()>0) st.push(q.remove());
        while(st.size()>0) q.add(st.pop());
        return q;
    }
    public static void main(String[] args) {
        //gfg
        Queue<Integer> q=new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(3);
        q.add(1);
        System.out.println(reorderQueue(q));
    }
}
