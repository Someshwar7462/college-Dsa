package OOPS.Polymorphism.MethodOverloading;
// case 1: No suitable method found
class methodoverloading1{
    public void add(int a,int b){
        System.out.println("int-int argument");
    }
    public void add(float a){
        System.out.println("float argument");
    }
}
//case 2: ambigious method call compileTime Error gives
class methodoverloading2{
    public void add(int a,float b){
        System.out.println("int-float argument");
    }
    public void add(float a,int b){
        System.out.println("float-int argument");
    }
}

//Case 3: string or object
class methodoverloading3{
    public void methodone(String s){
        System.out.println("String Version");
    }
    public void methodone(Object o){
        System.out.println("Object version");
    }

}

//case 4:extend the case 3
class methodoverloading4{
    public void methodone(String s){
        System.out.println("String Version");
    }
    public void methodone(Object o){
        System.out.println("Object version");
    }
    public void methodone(StringBuffer sb){
        System.out.println("StringBuffer Version");
    }
}

//cas 5:compiler will bind the method call based on the reference type but not on the runtime object
class Animal{}
class Monkey extends Animal{}
class AnimalApp{
    public void m1(Monkey m){
        System.out.println("Monkey Version");
    }
    public void m1(Animal a){
        System.out.println("Animal Version");
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
       // case 1
       methodoverloading1 m1=new methodoverloading1();
       m1.add(10);//int->int,float
       m1.add('a');//char->char,int
       m1.add(20l);//long->long,float
      //m1.add(10.5);//double->double so, it has not suitable method(error:incompatible types: possible lossy conversion from double to float)

        //case 2
        methodoverloading2 m2=new methodoverloading2();
        m2.add(5,5.8f);//int,float
        m2.add(10.5f,78);//float,int
        //m2.add(5,40); //it gives error:reference to add is ambiguous both method add(int,float) in OOPS.Polymorphism.MethodOverloading.methodoverloading2 and method add(float,int) in OOPS.Polymorphism.MethodOverloading.methodoverloading2 match
        System.out.println();

        //case 3
        methodoverloading3 m3=new methodoverloading3();
        m3.methodone("Somu");
        m3.methodone(new Object());
        m3.methodone(null);
        System.out.println();

        //case 4
        methodoverloading4 m4=new methodoverloading4();
        m4.methodone("Somu");
        m4.methodone(new Object());
        m4.methodone(new StringBuffer("somu"));
        //m4.methodone(null);  //reference to methodone is ambiguous
        System.out.println();

        //case 5
        AnimalApp a=new AnimalApp();
        Monkey m=new Monkey();
        a.m1(m);
        Animal animal=new Animal();
        a.m1(animal);
        Animal an=new Animal();
        a.m1(an);
    }
}
