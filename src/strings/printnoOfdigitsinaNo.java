package strings;

public class printnoOfdigitsinaNo {
    public static void main(String[] args) {
        int n=56487;
        String s=n+"";
        int m=s.length();
        System.out.println(m);
//by using buildIn function -> Integer.toString(n)
        String s1=Integer.toString(n);
        System.out.println(s1.length());
    }
}
