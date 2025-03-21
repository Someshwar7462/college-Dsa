package Method;
class C{
    int res;
    int div(int a,int b){
        res=a/b;
        return res;
    }
}
public class type4 {// input  provide and output also given
    public static void main(String[] args) {
        C c=new C();
        int ans=c.div(90,9);
        System.out.println(ans);
    }
}
