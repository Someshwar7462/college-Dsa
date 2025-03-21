package strings;
import java.util.*;
public class inputinstringbuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String s=sc.nextLine();
        //StringBuilder sb=new StringBuilder(s);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        System.out.println(sb);
        //in stringbuilder we can change the any character of string using setcharAt(inedx,element) but in string it is not allow
        sb.setCharAt(1,'a');
        //sb.setCahrAt(4)='r'; this is not possible in java
        System.out.println(sb);//aacd
    }
}
