package OOPS.Polymorphism.MethodOveriding;
class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Monkey extends Animal{
    public void eat(){
        System.out.println("Monkey is eating");
    }
    public void sleep(){
        System.out.println("Monkey is sleeping");
    }
}
class Deer extends Animal{
    public void eat(){
        System.out.println("Deer is eating");
    }
    public void sleep(){
        System.out.println("Deer is sleeping");
    }
}
class Lion extends Deer{
    public void eat(){
        System.out.println("Lion is eating");
    }
    public void sleep(){
        System.out.println("Lion is sleeping");
    }
}
class Forest{
    public void allowAnimal(Animal a){
        a.eat();
        a.sleep();
        System.out.println();
    }
}
public class Example3 {
    public static void main(String[] args) {
       // Animal a=new Animal();
        Monkey m=new Monkey();
        Deer d=new Deer();
        Lion l=new Lion();

        Forest f=new Forest();
        f.allowAnimal(new Animal());
        f.allowAnimal(m);
        f.allowAnimal(d);
        f.allowAnimal(l);
    }
}
