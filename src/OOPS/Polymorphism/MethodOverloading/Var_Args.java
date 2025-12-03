package OOPS.Polymorphism.MethodOverloading;
class calculator{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void add(int a,int b,int c ,int d){
        System.out.println(a+b+c+d);
    }
    public void add(int a,int b,int c,int d,int e){
        System.out.println(a+b+c+d+e);
    }
}
class AdvancedCalculator{
    public void add(int... args){
        int sum=0;
        for(int data:args){
            sum+=data;
        }
        System.out.println(sum);
    }
}
public class Var_Args {
    public static void main(String[] args) {
        calculator c1=new calculator();
        c1.add(1,2);
        c1.add(1,2,3);
        c1.add(1,2,3,4);
        c1.add(1,2,3,4,5);
        System.out.println();

        AdvancedCalculator ac=new AdvancedCalculator();
        ac.add(1,2);
        ac.add(1,2,3);
        ac.add(1,2,3,4);
        ac.add(1,2,3,4,5);

    }
}
