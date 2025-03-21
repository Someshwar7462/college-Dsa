package strings;
import java.util.*;
public class countvowel {
    public static boolean isvowel(char ch){
        if(ch=='a' || ch=='A') return true;
        if(ch=='e' || ch=='E') return true;
        if(ch=='i' || ch=='I') return true;
        if(ch=='o' || ch=='O') return true;
        if(ch=='u' || ch=='U') return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        int m=str.length();
        int count=0;
        for(int i=0;i<m;i++){
            char ch=str.charAt(i);
            if(isvowel(ch)==true){
                count++;
            }
        }
        System.out.println(count);
    }
}
// second method without method
//Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the string");
//                String str=sc.nextLine();
//                int count=0;
//                for(int i=0;i<str.length();i++){
//        char ch=str.charAt(i);
//        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
//        count++;
//        }
//        System.out.println(count);
//        }