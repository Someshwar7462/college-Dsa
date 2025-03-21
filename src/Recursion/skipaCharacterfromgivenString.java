package Recursion;

public class skipaCharacterfromgivenString {//skip chracter a
    public static void skip(String s,String ans,int i){
        if(i==s.length()) {
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)!='a'){
            ans+=s.charAt(i);
        }

        skip(s,ans,i+1);
    }
    public static void main(String[] args) {
        //without using recursion
//        String s="someshwar prasad gupta";
//        String ans="";
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)!='a'){
//                ans+=s.charAt(i);
//            }
//        }
//        System.out.println(ans);
        String s="Someshwar prasad gupta";
        String ans="";
        skip(s,ans,0);
    }
}
