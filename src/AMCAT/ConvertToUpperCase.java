package AMCAT;

public class ConvertToUpperCase {
    public static String uppercase(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            ans+=Character.toUpperCase(s.charAt(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(uppercase("string"));
    }
}
