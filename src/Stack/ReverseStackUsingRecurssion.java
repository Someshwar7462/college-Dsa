package Stack;

import java.util.Stack;

public class ReverseStackUsingRecurssion {
    public static void displayrecursively(Stack<Integer> st){
        //base case
        if(st.isEmpty()) return;
        int top=st.pop();
        //if we want print the stack using recursion
//        displayrecursively(st);
//        System.out.println(top);

        //print reverse recursively
        System.out.println(top);
        displayrecursively(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(4);
        st.push(3);
        st.push(40);
        st.push(10);
        displayrecursively(st);
    }
}
