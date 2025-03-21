package strings;
import java.util.*;
public class reversestringbuilderwithoutusingbuildinfn {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the stringBuilder");
      StringBuilder sb=new StringBuilder(sc.nextLine());
      int m=sb.length();
      int i=0;
      int j=m-1;
        StringBuilder sb1=new StringBuilder("");
      while(i<=j){
          char temp=sb.charAt(i);
          sb.setCharAt(i,sb.charAt(j));
          sb.setCharAt(j,temp);
          i++;
          j--;
      }
        System.out.println(sb);
    }
}
