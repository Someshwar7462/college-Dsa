package OOPS.Polymorphism.MethodOverloading;
class Demo{
    //exact match: one argument
    public void methodone(int i){
        System.out.println("General method");
    }
    //var_args:0..n
    public void methodone(int... i){
        System.out.println("Var_Args method");
    }
}
public class var_argsVsOverloadedMethod {
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.methodone();
        d1.methodone(10);
        d1.methodone(10,20);
    }
}
