package strings;

public class printmaxvalueofstringarray {
    public static void main(String[] args) {
        String[] s={"1546","23454","5454"};
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<s.length;i++){
            int n=Integer.parseInt(s[i]);
            mx=Math.max(mx,n);
        }
        System.out.println(mx);
    }
}
