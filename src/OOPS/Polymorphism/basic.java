package OOPS.Polymorphism;
class calculator{
    public void add(int a,int b){
        System.out.println("int-int argument");
    }
    public void add(float a,float b){
        System.out.println("float-float argument");
    }
    public void add(double a,double b){
        System.out.println("double-double argument");
    }
}
public class basic {
    public static void main(String[] args) {
        calculator c=new calculator();
        c.add(2.3f,5.4f);
        c.add(2.45,8.90);
        c.add(1,4);
    }
}
