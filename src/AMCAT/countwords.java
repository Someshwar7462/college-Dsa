package AMCAT;

public class countwords {
    public static int count(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count("string"));
    }
}
