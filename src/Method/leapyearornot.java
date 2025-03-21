package Method;
class year{
    void leapyear(int n){
        if(n%4==0 && n%100!=0 || n%400==0)
            System.out.println("leap year");
        else
            System.out.println("not leap year");
    }
}
public class leapyearornot {
    public static void main(String[] args) {
        year y=new year();
        y.leapyear(3007);
    }
}
