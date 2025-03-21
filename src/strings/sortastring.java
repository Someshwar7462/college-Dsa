package strings;
import java.util.*;
public class sortastring {
    public static void main(String[] args) {
        //for string
        String s="someshwar";
        char[] ch=s.toCharArray();//change into char array
        Arrays.sort(ch);
        System.out.println(ch);
        //for string builder
        StringBuilder sb=new StringBuilder("prince");
        char[] chh=sb.toString().toCharArray();
        Arrays.sort(chh);
        System.out.println(chh);
    }
}
