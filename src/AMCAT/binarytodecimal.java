package AMCAT;

public class binarytodecimal {
    public static int BToD(int binary){
        int decimal=0,power=1;
        while(binary>0){
            int ld=binary%10;
            decimal+=ld*power;
            power*=2;
            binary/=10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        System.out.println(BToD(101011));
    }
}
