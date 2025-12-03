package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class RemoveEvenIndexElement {
    static Queue<Integer> que;
    static Queue<Integer> newque;
    static void RemoveEvenIndex(){
       newque=new LinkedList<>();
       while(!que.isEmpty()){
           que.remove();
           if(!que.isEmpty()){
               newque.add(que.remove());
           }
       }
       que=newque;
    }
    static void RemoveOddIndexElements(){
        newque=new LinkedList<>();
        while(!que.isEmpty()){
            newque.add(que.remove());
            if(!que.isEmpty()){
                que.remove();
            }
        }
        que=newque;
    }
    public static void main(String[] args) {
        que=new ArrayDeque<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println(que);
        RemoveEvenIndex();
        System.out.println(que);

        //clear the que
        que.clear();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        RemoveOddIndexElements();
        System.out.println(que);

    }
}
