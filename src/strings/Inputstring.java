package strings;
import java.sql.SQLOutput;
import java.util.*;
public class Inputstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        //.next()->it gives only first word after space it cannot work
        //String str=sc.next();
        //but .nextLine()->it gives whole string with space
        String str=sc.nextLine();
        System.out.println(str);
    }
}
