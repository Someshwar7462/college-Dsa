package OOPS;
class instant{
    String name;
    int rollno;
    instant(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
}
//instant variable:- which is declaring outside the function but inside the class
public class InstantVariable {
    public static void main(String[] args) {
        instant i=new instant("Somu",1);
        System.out.println(i.name);
        System.out.println(i.rollno);
    }
}
