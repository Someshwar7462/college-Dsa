package Recursion;

public class FunctionCall {
    public static void mango(){
        System.out.println("I am in mango");
    }
    public static void banana(){
        System.out.println("I am in banana");
        mango();
    }
    public static void apple(){
        mango();
        System.out.println("I am in apple");
        banana();
    }
    public static void main(String[] args) {
        System.out.println("I am in main");
        apple();
    }
}
