package strings;

public class stringimmutability {
    public static void main(String[] args) {
        //in java string is immutable but we can , it takes more space and time im memory
        String s="Someshwar";
        // to change Soneshwar
        // 2nd index m ko n me change karo but Someshwar bhi memory me kahi float karta hai
        s=s.substring(0,2)+'n'+s.substring(3);
        System.out.println(s);
    }
}
