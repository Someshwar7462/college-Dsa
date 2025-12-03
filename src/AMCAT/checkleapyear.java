package AMCAT;

public class checkleapyear {
    public static boolean leap(int n){
        if(n%4==0 && (n%100!=0 || n%400==0))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(leap(2004));
    }
}
