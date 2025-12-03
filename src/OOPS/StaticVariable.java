package OOPS;
class Static{
    static float a=5.8f;
}
public class StaticVariable {
    public static void main(String[] args) {
        //static variable is access by two ways 1.)using className 2.)reference of object
        //1)using className
        System.out.println(Static.a);
        System.out.println(new Static().a);
    }
}
