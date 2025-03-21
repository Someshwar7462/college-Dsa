package strings;

public class compressthestring {
    public static void main(String[] args) {
        String s="aaabbccaaagg";
        String ans="";
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
               ans+=s.charAt(i);
               int len=j-i;
               if(len>1) ans+=len;
               i=j;
            }
        }
        //for the last two character
        ans+=s.charAt(i);
        int len=j-i;
        if(len>1) ans+=len;
        System.out.println(ans);
    }
}
