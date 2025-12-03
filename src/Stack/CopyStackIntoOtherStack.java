package Stack;
import java.util.Stack;
public class CopyStackIntoOtherStack {
    public static void main(String[] args) {
        Stack<Integer> Original_st=new Stack<>();
        Original_st.push(10);
        Original_st.push(20);
        Original_st.push(30);
        Original_st.push(40);
        System.out.println(Original_st);

        Stack<Integer> temp_st=new Stack<>();
        while(!Original_st.isEmpty()){
            temp_st.push(Original_st.pop());
        }
        System.out.println(temp_st);

        Stack<Integer> Final_st=new Stack<>();
        while(!temp_st.isEmpty()){
            Final_st.push(temp_st.pop());
        }
        System.out.println(Final_st);
    }
}
