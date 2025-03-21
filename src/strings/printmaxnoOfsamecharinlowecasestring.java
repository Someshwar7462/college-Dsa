package strings;
import java.util.Scanner;
public class printmaxnoOfsamecharinlowecasestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next();
        int[] freq=new int[26];
        //0-a,1-b,....,25-z to fill this array and it is initially contains 0
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=(int)ch-97;
            freq[idx]++;
        }
        //to find the max freq
        int maxfreq=0;
        for(int i=0;i<freq.length;i++){
            maxfreq=Math.max(maxfreq,freq[i]);
        }
        //if two latter has same freq
        for(int i=0;i<freq.length;i++){
            if(freq[i]==maxfreq){
                char ch=(char)(i+97);
                System.out.print(ch+" ");
            }
        }
        //to find the number of character is repeated but this not run
//        for(int i=0;i<freq.length;i++){
//            if(freq[i]>0){
//                char ch=(char)(i+97);
//                System.out.println(freq);
//            }
//        }
    }
}
