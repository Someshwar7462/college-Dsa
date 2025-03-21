package Method;
class value1{
    public void change(int x){
        x=10;
    }
}
public class changevalue {
    public static void main(String[] args) {
        int x=6;
        System.out.println(x);
        value1 v=new value1();
        v.change(x);
        System.out.println(x);//pass by value
    }
}
