package Method;
class D{
    void checking(int n){
        if(n%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }

}
public class evenodd {
    public static void main(String[] args) {
        int n=5;
        D d=new D();
        d.checking(n);
    }
}
