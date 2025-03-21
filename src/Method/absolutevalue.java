package Method;
class value{
    int absolute(int n){
        if(n<0)
        return n*(-1);
        else
            return n;
    }
}
public class absolutevalue {
    public static void main(String[] args) {
        value v=new value();
        int n=5;
       int ans= v.absolute(n);
        System.out.println(ans);
    }
}
