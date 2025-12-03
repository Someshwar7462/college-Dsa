package Stack;
import java.util.Stack;
public class PostfixToInfix {
    public static void main(String[] args) {
        Stack<String> str=new Stack<>();
        String s="953+4*6/-";
        System.out.println(s);

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                String s1=""+ch;
                str.push(s1);
            }else{
                String v2=str.pop();
                String v1=str.pop();
                if(ch=='+') str.push('('+v1+ch+v2+')');
                if(ch=='-') str.push('('+v1+ch+v2+')');
                if(ch=='*') str.push('('+v1+ch+v2+')');
                if(ch=='/') str.push('('+v1+ch+v2+')');
            }
        }
        System.out.println(str.peek());
    }
}
