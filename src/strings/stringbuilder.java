package strings;

public class stringbuilder {
    public static void main(String[] args) {
        //initilization and declerartion same as the string
        //in stringbuilder we use all string method in stringbuilder same
        StringBuilder sbr=new StringBuilder("asdfg");
        System.out.println(sbr);
        System.out.println(sbr.length());
        System.out.println(sbr.capacity());//16(by deafult)+5(length of given string)=21
        StringBuilder sbr1=new StringBuilder();
        //stringbuilder has 16 capacity by default it means it has capacity to store the 16 character to make string
        //by default it contains space in memory to store the 16 character
        //if we add an string to stringbuilder it inceased the capacity of its according to the size of string
        System.out.println(sbr1.capacity());
        // to create the empty stringbuilder
        StringBuilder sbr2=new StringBuilder("");
        System.out.println(sbr2);
        //if we assign the capacity of stringbuilder then it's capacity is fixed now
        StringBuilder sbr3=new StringBuilder(6);
        System.out.println(sbr3.capacity());
    }
}
