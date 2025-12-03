package OOPS;
class Person{
    public String name;
    public String address;
    public int age;
}
class Student extends Person{
    public int marks;
    public String grade;
    Student(String name,String address,int age,int marks,String grade){
        this.name=name;
        this.address=address;
        this.age=age;
        this.marks=marks;
        this.grade=grade;

    }
    public void display(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
        System.out.println(marks);
        System.out.println(grade);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Student s=new Student("Somu","bth",21,100,"A");
        s.display();
    }
}
