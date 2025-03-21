package Method;

import java.security.spec.RSAOtherPrimeInfo;

class circle{
    double area1;
    double area(double r){
        area1=3.14*r*r;
        return area1;
    }
}
public class areacircle {
    public static void main(String[] args) {
        circle c=new circle();
        double ans=c.area(3.4);
        System.out.println(ans);

    }
}
