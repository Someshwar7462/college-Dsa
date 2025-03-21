package strings;

public class printallsubstring {
    public static void main(String[] args) {
        String s="Prince";
        int m=s.length();
        for(int i=0;i<m;i++){
//            System.out.println(s.substring(0,i)); / for only start with a
            for(int j=i+1;j<=m;j++){
                System.out.println(s.substring(i,j)+" ");
            }
            //System.out.println();
        }
    }
}
