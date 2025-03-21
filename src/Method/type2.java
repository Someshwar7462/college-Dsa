package Method;
class Aa{
    int a;
    int b;
    int res;
    int sub(){
        a=9;
        b=4;
        res=a-b;
        return res;
    }
}
public class type2 {// no input but provide output
    public static void main(String[] args) {
     Aa a=new Aa();
     int sum=a.sub();
        System.out.println(sum);
    }
}
