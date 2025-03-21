package Method;
class B{
    int res;
    void mul(int a,int b){// here a,b is formal parameters or parameters
       res=a*b;
        System.out.println(res);
    }
}
public class type3 {// no output and take input
    public static void main(String[] args) {
        int x=8;
        int y=6;
        B b=new B();
        b.mul(x,y);// x,y is actual parameters or arguments
    }
}
