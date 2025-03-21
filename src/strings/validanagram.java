package strings;
import java.util.*;
public class validanagram {
    public static boolean isanagram(String s,String t){
        if(s.length()!=t.length()) return false;
        char[] a=s.toCharArray();
        Arrays.sort(a);
        char[] b=t.toCharArray();
        Arrays.sort(b);
        for(int i=0;i<s.length();i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="gramana";
         boolean result=isanagram(s,t);
        System.out.println("Are \"" + s + "\" and \"" + t + "\" anagrams? " + result);
    }
}
