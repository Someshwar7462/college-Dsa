package OOPS;
class Aadmi{
    String name;
    String address;
    int age;
    // parameterized constructor
    Aadmi(String name,String address,int age){
        System.out.println("Constructor is called");
        this.name=name;
        this.address=address;
        this.age=age;
    }
    // not-parametrized constructor
    Aadmi(){
        System.out.println("Not-parametrized constructor is called");
    }
    //method
    public void disp(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
    }
}
public class constructor {
    public static void main(String[] args) {
        //parameterized constructor
        Aadmi a1=new Aadmi("Somu","bth",21);
        a1.disp();
        //non-parametrized constructor
        Aadmi a2=new Aadmi();
        a2.disp();
    }
}
