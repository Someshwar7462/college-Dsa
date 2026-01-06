package HashMapAndHashSet;
import java.util.HashSet;
public class FindMaximumNumberofStringPairs {
    public static String reverse(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        return sb.reverse().toString();
    }
    public static int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set=new HashSet<>();
        int count=0;
        for(int i=0;i<words.length;i++){
            String rev=reverse(words[i]);
            if(set.contains(rev)){
                count++;
                set.remove(rev);
            }else set.add(words[i]);
        }
        return count;

    }
    public static void main(String[] args) {
        //leetCode :2744
        String[] words={"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(words));

    }
}
