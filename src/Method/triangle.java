package Method;
class triangles{
    void checktriangle(int a,int b,int c){
        if(a==b && b==c && c==a)
            System.out.println("Equilateral triangle");
        else if(a==b || b==c || c==a )
            System.out.println("Isolesceles triangle");
        else
            System.out.println("Scalane triangle");
    }
}
public class triangle {
    public static void main(String[] args) {
     triangles t=new triangles();
     t.checktriangle(4,4,4);
    }
}
