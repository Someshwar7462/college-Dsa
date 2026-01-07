package HashMapAndHashSet;

import java.util.HashMap;
import java.util.Scanner;

public class ValidAnaGram {
    public static Boolean Checkanagram(String s,String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> sMap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(sMap.containsKey(ch)){
                int freq=sMap.get(ch);
                sMap.put(ch,freq+1);
            }else sMap.put(ch,1);
        }
        HashMap<Character, Integer> tMap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(tMap.containsKey(ch)){
                int freq=tMap.get(ch);
                tMap.put(ch,freq+1);
            }else tMap.put(ch,1);
        }
        for(char key:sMap.keySet()){
            int val1=sMap.get(key);
            if(!tMap.containsKey(key)) return false;
            int val2=tMap.get(key);
            if(val1!=val2) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        //LeetCode :242
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String s");
        String s=sc.nextLine();
        System.out.println("Enter the string t");
        String t=sc.nextLine();
        System.out.println(Checkanagram(s,t));
    }
}
