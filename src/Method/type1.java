package Method;
class Calculator{
    int a;
    int b;
    int res;
    void add(){// method deceleration
        a=10;
        b=20;
        res=a+b;
        System.out.println(res);
    }
}
public class type1 {//no input and no output method
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        calc.add();// method call
    }
}
