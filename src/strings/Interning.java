package strings;

public class Interning {
    public static void main(String[] args) {
        String s="Someshwar";
        //in string individual chararcter can not change
           //s.charAt(0)='y';
        s="Yogeshwar";//in memory s can not permanentely changed to yogeshwarans Someshwar also present in the memory, now s indicate the Yogeshwar not Someshwar
        System.out.println(s);
        String q="Yogeshwar";
        //here s and q both indicates the Yogeshwar but another Yogeshwar is created due to this save memory space

        //new keyword
        String s1="Yogeshwar";
        // due to this new keyword Yogeshwar is created to take another space in the memory
    }
}
