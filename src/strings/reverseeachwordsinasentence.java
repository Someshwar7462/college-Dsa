package strings;
import java.util.Scanner;
public class reverseeachwordsinasentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the stringBuilder");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int n=sb.length();
        int i=0,j=0;
        while(j<n){
            if(sb.charAt(j)!=' ') j++;
            else{
                reverse(sb,i,j-1);
                i=j+1;
                j=i;
            }
        }
        reverse(sb,i,j-1);//reverse for last word
        System.out.println(sb);
    }
    //method to reverse the part of stringbuilder
    public static void reverse(StringBuilder sb,int i,int j){
        char temp=sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,temp);
        i++;
        j--;
    }
}
