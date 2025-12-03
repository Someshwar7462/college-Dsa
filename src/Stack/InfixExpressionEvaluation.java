package Stack;
import java.util.Stack;
public class InfixExpressionEvaluation {
    public static void main(String[] args) {
       Stack<Integer> val=new Stack<>();
       String s="-8/*+5376";
        System.out.println(s);

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }else{
                int v1=val.pop();
                int v2=val.pop();
                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);

            }
        }
        System.out.println(val.peek());
    }
}
