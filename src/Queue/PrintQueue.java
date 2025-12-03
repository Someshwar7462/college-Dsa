package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrintQueue {
    public static void main(String[] args) {
        //print queue using only add,remove,peek using extra queue not direct print method
        Queue<Integer> que=new ArrayDeque<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);

        Queue<Integer> helperque=new ArrayDeque<>();
        while(!que.isEmpty()){
            System.out.print(que.peek()+ ",");
            helperque.add(que.remove());
        }
        while(!helperque.isEmpty()){
            que.add(helperque.remove());
        }



    }
}
