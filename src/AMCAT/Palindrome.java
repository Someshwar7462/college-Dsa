package AMCAT;

public class Palindrome {
    public static boolean palindrome(int n){
        int origanl=n;
        int ans=0;
        while(n>0){
            int ld=n%10;
            ans=ans*10+ld;
            n=n/10;
        }
        if(origanl==ans) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }
}
