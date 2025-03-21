package strings;
import java.util.Scanner;
public class togglecharacter {//toggle means-> string me jo capital hai usko small banaoo aur jo small hai usko capital banao
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char ch=sb.charAt(i);
            int ascii=(int)ch;
            if(ascii>=65 && ascii<=90){// it means it is capital latter
                ascii=ascii+32;
                ch=(char)ascii;
                sb.setCharAt(i,ch);
            }
            else{// small latter
                ascii=ascii-32;
                ch=(char)ascii;
                sb.setCharAt(i,ch);
            }
        }
        System.out.println(sb);
    }
}
