package strings;

import java.util.Scanner;

public class MaxNestedParentheis {
    public static int CountNestedParenthesis(String s){
        if(s.length()==0)return 0;
        int depth=0,maxDepth=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                depth++;
                maxDepth=Math.max(maxDepth,depth);
            }else depth--;
        }
        return maxDepth;
    }
    public static void main(String[] args) {
        //LeetCode 1614
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        System.out.println(CountNestedParenthesis(s));
    }
}
