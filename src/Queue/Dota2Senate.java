package Queue;
import java.util.*;
public class Dota2Senate {
    public static String predictPartyVictory(String senate) {
        Queue<Integer> r=new LinkedList<>();
        Queue<Integer> d=new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<n;i++){
            char ch=senate.charAt(i);
            if(ch=='R') r.add(i);
            else d.add(i);
        }
        while(!r.isEmpty() && !d.isEmpty()){
            if(r.peek()<d.peek()) r.add(n++);
            else d.add(n++);
            r.remove();
            d.remove();
        }
        return r.isEmpty() ? "Dire" : "Radiant";

    }
    public static void main(String[] args) {
        //leetcode 649
        String s="RDD";
        System.out.println(predictPartyVictory(s));
    }
}
