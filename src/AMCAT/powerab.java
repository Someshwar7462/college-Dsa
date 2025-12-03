package AMCAT;

public class powerab {
    public static int power(int a,int b){
        int ans=1;
        for(int i=1;i<=b;i++){
            ans*=a;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}
