package Method;
class squares{
    void square(int n){
        for(int i=1;i<=n;i++){
            int sqr=i*i;
            System.out.println(sqr);
        }
    }
}
public class squareoffirstnnumber {
    public static void main(String[] args) {
        squares a=new squares();
        a.square(5);
    }
}
