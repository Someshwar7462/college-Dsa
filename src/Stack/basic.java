package Stack;
import java.util.Stack;
public class basic {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        st.push(4);
        st.push(3);
        st.push(40);
        st.push(10);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        //print stack
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.pop();
        System.out.println(st);
        System.out.println(st.size());

        st.push(40);
        st.push(10);
        st.push(5);
        st.push(9);
        System.out.println(st);
        System.out.println(st.size());

        //if e ant access the first element that is 4
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());

        //if we want to push ele in stack using loop
        for(int i=0;i<7;i++){
            st.push(i);
        }
        System.out.println(st);
        System.out.println(st.size());

    }
}
