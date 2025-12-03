package AMCAT;

public class armstrongnumber {
    public static boolean armstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=ld*ld*ld;
            n/=10;
        }
        if(sum==original) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(armstrong(153));
    }
}
