package strings;

public class appendinstringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("asdf");
        System.out.println(sb);
        // append-> it is used to add string to stringbuilder ,in this stringbuilder we can not use + operator
        sb.append("xyz");//string ko append kar sakte hai
        System.out.println(sb);
        sb.append('j');//character ko append kar sakte hai
        System.out.println(sb);
        sb.append(78);//integer ko append kar sakte hai
        System.out.println(sb);
        char[] ch={'a','h','k'};
        sb.append(ch);//char array ko append kar sakte hai
        System.out.println(sb);
//        int[] arr={1,2,3,4};
//        sb.append(arr);//int array ko append nahi kar sakte hai ,eska address append ho jata hai
//        System.out.println(sb);
        StringBuilder t=new StringBuilder("lkjh");
        sb.append(t); //stringbuilder ko append kar sakte hai
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
