package loops;

public class infiniteloop {
    public static void main(String[] args) {
//        while('a'<'b')
//            System.out.println("malyalam is a palindrome");

        //predict output
        int x=4;
        int y=0;
        while(x>=0){
            x--;
            y++;
            if(x==y)
                continue;
            else
                System.out.println(x+" "+y);
        }




    }
}
