package Queue;
import java.util.*;
public class ImplementationOfQueueUsingStack {
    //leetcode 232
    Stack<Integer> input;
    Stack<Integer> output;
    public ImplementationOfQueueUsingStack() {
        input=new Stack<>();
        output=new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        if(output.size()!=0){
            return output.pop();
        }else{
            while(input.size()!=0){
                output.push(input.pop());
            }
            return output.pop();
        }
    }

    public int peek() {
        if(output.size()!=0){
            return output.peek();
        }else{
            while(input.size()!=0){
                output.push(input.pop());
            }
            return output.peek();
        }

    }

    public boolean empty() {
        return input.size()==0 && output.size()==0;

    }
    public static void main(String[] args) {
        ImplementationOfQueueUsingStack q = new ImplementationOfQueueUsingStack();
        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.peek());  // 1
        System.out.println(q.pop());   // 1
        System.out.println(q.peek());  // 2
        System.out.println(q.empty()); // false
        q.pop(); // remove 2
        q.pop(); // remove 3
        System.out.println(q.empty()); // true
    }
}
