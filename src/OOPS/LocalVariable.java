package OOPS;
class local{
    public int add(int a,int b){
        return a+b;
    }
}
//local variable-> the variable which is declaring inside the method
public class LocalVariable {
    public static void main(String[] args) {
      local l=new local();
        System.out.println(l.add(2,5));
    }
}
