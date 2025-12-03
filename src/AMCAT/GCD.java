package AMCAT;

public class GCD {
    public static int gcd(int a,int b){
        while(a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(gcd(6,3));
    }
}
