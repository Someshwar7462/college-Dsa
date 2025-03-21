package Method;
class between{
    void odd(int a,int b){
        for(int i=a+1;i<b;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
public class printoddbetweenwaaandb {
    public static void main(String[] args) {
        between b=new between();
        b.odd(45,78);
    }
}
