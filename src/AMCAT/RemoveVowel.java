package AMCAT;

public class RemoveVowel {
    public static String remove(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(remove("string"));
    }
}
