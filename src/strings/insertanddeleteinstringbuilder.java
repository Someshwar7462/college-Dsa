package strings;

public class insertanddeleteinstringbuilder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("zxcvb");
        System.out.println(s);
        //kisi particular character ko delete karna hai to
        s.deleteCharAt(3);
        System.out.println(s);//zxcb
        s.append("qwer");
        System.out.println(s);
        //range me delete karna hai to
        s.delete(3,6);//index 3 se index 5 tak caharacter delete ho jayega
        System.out.println(s);

        //ab inser karte hai
        s.insert(4,'p');
        System.out.println(s);
    }
}
