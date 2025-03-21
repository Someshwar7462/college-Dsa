package strings;

public class stringbuildermethod {
    public static void main(String[] args) {
        //some string method is work in stringbuilder same as well
        StringBuilder s=new StringBuilder("somu");
        StringBuilder s1=new StringBuilder("sonu");
        System.out.println(s.compareTo(s1));
        System.out.println(s);
        //reverse()-> it reverse the string
        System.out.println(s.reverse());
    }
}
