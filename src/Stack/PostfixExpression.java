package Stack;
import java.util.Stack;
public class PostfixExpression {
    public static void main(String[] args) {
        String s="8-(5+3)*4/6";
        System.out.println(s);
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                String s1=""+ch;
                val.push(s1);
            }else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push(ch);
            else if(ch==')'){
                //perform all operation till close barcket is not come
                while(op.peek()!='('){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.peek();
                    String t=v1+v2+o;
                    val.push(t);
                    op.pop();
                }
                op.pop();
            }else{
                if(ch=='+' || ch=='-'){
                    //do all operation
                    String v2=val.pop();
                    String v1= val.pop();
                    char o=op.pop();
                    String t=v1+v2+o;
                    val.push(t);
                    op.pop();
                }else if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String v2=val.pop();
                        String v1=val.pop();
                        char o=op.pop();
                        String t=v1+v2+o;
                        val.push(t);
                        op.push(ch);
                    }else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char o=op.pop();
            String t=v1+v2+o;
            val.push(t);
        }
        System.out.println(val.peek());
    }
}
