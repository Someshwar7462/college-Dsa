package AMCAT;
public class reversethenumber {
    public static int reverse(int n){
        int ans=0;
        while(n>0){
          int ld=n%10;
          ans=ans*10+ld;
          n=n/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=12345;
        System.out.println(reverse(n));
    }
}
