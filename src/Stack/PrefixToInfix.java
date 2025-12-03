package Stack;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        Stack<String> str=new Stack<>();
        String s="-9/*+5346";
        System.out.println(s);

        for(int i=s.length()-1 ;i>=0;i--){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                String s1=""+ch;
                str.push(s1);
            }else{
                String v1=str.pop();
                String v2=str.pop();
                if(ch=='+') str.push('('+v1+ch+v2+')');
                if(ch=='-') str.push('('+v1+ch+v2+')');
                if(ch=='*') str.push('('+v1+ch+v2+')');
                if(ch=='/') str.push('('+v1+ch+v2+')');
            }
        }
        System.out.println(str.peek());
    }
}
