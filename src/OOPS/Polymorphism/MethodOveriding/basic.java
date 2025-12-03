package OOPS.Polymorphism.MethodOveriding;
class parent{
    public void property(){
        System.out.println("land+cash+gold");
    }
    public void merriage(){
        System.out.println("RelativeGirl");
    }
}
class child extends parent{
    public void merriage(){//overiding and re implementation
        System.out.println("Another girl");
    }
}
public class basic {
    public static void main(String[] args) {
        //parent object
       parent p1=new parent();
       p1.property();
       p1.merriage();
       System.out.println();
       // child object
       child c1=new child();
       c1.merriage();
       c1.property();
        System.out.println();

       //child object
        parent p2=new child();
        p2.merriage();
        p2.property();

    }
}
