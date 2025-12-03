package OOPS.Polymorphism.MethodOveriding;
class Plane{
    public void takeoff(){
        System.out.println("plane tookoff");
    }
    public void fly(){
        System.out.println("plane is flying");
    }
    public void land() {
        System.out.println("plane is landing");
    }
}
class PassengerPlane extends Plane{
    public void takeoff(){
        System.out.println("PassengerPlane is tookoff");
    }
    public void fly(){
        System.out.println("PassengerPlane is flying");
    }
    public void land(){
        System.out.println("PassengerPlane is landing");
    }
}
class CargoPlane extends Plane{
    public void takeoff(){
        System.out.println("CargoPlane is tookoff");
    }
    public void fly(){
        System.out.println("CargoPlane is flying");
    }
    public void land(){
        System.out.println("CargoPlane is landing");
    }
}
class FighterPlane extends Plane{
    public void takeoff(){
        System.out.println("FighterPlane is tookoff");
    }
    public void fly(){
        System.out.println("FighterPlane is flying");
    }
    public void land(){
        System.out.println("FighterPlane is landing");
    }
}
class Airport{
    //true ploymorphism -> methodoveriding
    public void allowPlane(Plane p){
        p.takeoff();
        p.fly();
        p.land();
        System.out.println();
    }
}
public class Example2 {
    public static void main(String[] args) {
        PassengerPlane p=new PassengerPlane();
        CargoPlane c=new CargoPlane();
        FighterPlane f=new FighterPlane();
        Airport a=new Airport();
        a.allowPlane(p);
        a.allowPlane(c);
        a.allowPlane(f);
    }
}
