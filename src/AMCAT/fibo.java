package AMCAT;

public class fibo {
    public static int fibonacci(int n){
        if(n<=1) return n;
        int prev2=0,prev1=1,curr=0;
        for(int i=2;i<=n;i++){
            curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(fibonacci(n));
    }
}

