package Method;
class counts{
    void count(int n){
        int count1=0;
        for(int i=0;i<=n;i++){
            n=n/10;
            count1++;
        }
        System.out.println(count1);
        System.out.println(count1*count1);
    }
}
public class count {
    public static void main(String[] args) {
        counts c=new counts();
        c.count(5678);
    }
}
