package Stack;
import java.util.Stack;
public class ReverseTheStack {
    public static void main(String[] args) {
        Stack<Integer> Original_st=new Stack<>();
        Original_st.push(10);
        Original_st.push(20);
        Original_st.push(30);
        Original_st.push(40);
        System.out.println(Original_st);

        Stack<Integer> Reversed_st=new Stack<>();
        while(!Original_st.isEmpty()){
//            int element=Original_st.pop();
//            Reversed_st.push(element);
            Reversed_st.push(Original_st.pop());
        }
        System.out.println(Reversed_st);
    }
}
