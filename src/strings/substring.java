package strings;

public class substring {
    public static void main(String[] args) {
        // in this substring topic we use some buildIn method to print the substring
        //1-> substring(i)-> it print from index i to length of string
        //2-> substring(i,j)-> it print from index i to j-1 of string
        //substring-> it is continious of given string
        String s="abcde";
        System.out.println(s.substring(1));
        System.out.println(s.substring(1,4));
        System.out.println(s.substring(2,2));//it print nothing
        System.out.println(s.substring(0,5));
    }
}
