package Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Basic {
    public static void main(String[] args) {
        //we always queue is declare using linkedlist,arraydeque bcz queue is abstract datatype
        //Queue<Integer> que=new Queue<>(); it is false due to its abstract datatype
        //Queue<Integer> que1=new ArrayDeque<>();
        Queue<Integer> que=new LinkedList<>();
        System.out.println(que.size());
        System.out.println(que.isEmpty());
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que);
        que.remove();
        System.out.println(que);
        que.poll();
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.size());
        System.out.println(que.isEmpty());

    }
}
