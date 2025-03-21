package strings;

public class equals {
    public static void main(String[] args) {
        //equals() vs ==
        //in string equals() is used to compare the two strings and gives the boolean output
        //but == is used to compare the int,long,short,double dta type(primitive dta type)
        //but in string when we used == operator then compare the address of the strings
        String s="abcxyz";
        String a="abcxyz";
        String b=new String(s);
        String c="abc";
        c=c+"xyz";
        //use of == operator in string in place of equals()
        System.out.println(s==a);//it gives true bcz s,a point to same same string abcxyz
        System.out.println(s==b);//it give false bcz b is created using by new key word which is take another space for abcxyz
        System.out.println(s==c);//it give false bcz c s another string which store abc and the add xyz to finally store abcxyz
        //now equals() is used in string comparision and equals() operator compare the strings by char to char
        System.out.println(s.equals(a));//true gives true bcz it compare character to character
        System.out.println(s.equals(b));
        System.out.println(s.equals(c));
    }
}
