package strings;

public class plusOperator {
    public static void main(String[] args) {
        String s="abcdf";
        String t="tree";
        s= s + t;
        s=10+s;
        s= s + 10;
        s=s+'p';
        s=s + "xyz";
        System.out.println(s);
        System.out.println("Hii i am "+11);
        System.out.println("jkl"+10+20);//first "jkl10"+20="jkl1020"
        System.out.println(10+20+"bnm");//first 10+20="30"+"bnm"="30bnm";
    }
}
