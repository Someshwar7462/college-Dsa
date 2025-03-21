package strings;
import java.util.*;
public class isisomorphism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string");
        String s=sc.next();
        System.out.println("Enter the 12st string");
        String t=sc.next();
        boolean result=isomorphic(s,t);
        System.out.println(result);
    }
    public static boolean isomorphic(String s,String t){
        char freq[]=new char[128];//initially it is empty '/0'
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){//one one mapping
            char ch=s.charAt(i);
            char dh=t.charAt(i);
            int idx=(int)ch;
            if(freq[idx]=='\0') freq[idx]=dh;
            else{
                if(freq[idx]!=dh) return false;
            }
        }
        for(int i=0;i<128;i++){
            freq[i]='\0';
        }
        for(int i=0;i<s.length();i++){//reverse mapping
            char ch=t.charAt(i);
            char dh=s.charAt(i);
            int idx=(int)ch;
            if(freq[idx]!='\0') freq[idx]=dh;
            else{
                if(freq[idx]!=dh) return false;
            }
        }
        return true;
    }
}
