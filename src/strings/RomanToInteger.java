package strings;
import java.util.Scanner;
public class RomanToInteger {
    public static int romantointeger(String s){
        if(s.isEmpty()) return 0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            int curr=value(s.charAt(i));
            int next;
            if(i+1<s.length()) next=value(s.charAt(i+1));
            else next=0;

            if(curr<next) ans-=curr;
            else ans+=curr;
        }
        return ans;
    }
    public static int value(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'x': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    public static void main(String[] args) {
        //LeetCode 13
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        System.out.println(romantointeger(s));
    }
}
