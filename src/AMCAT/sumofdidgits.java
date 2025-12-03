package AMCAT;

public class sumofdidgits {
    public static int digit(int n){
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=ld;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(digit(12345));
    }
}
