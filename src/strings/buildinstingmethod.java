package strings;

public class buildinstingmethod {
    public static void main(String[] args) {
        // String is a array of character
        String str="Prince is coder";
        //1-> .charAt()-> if we want to access a particular index's element
        System.out.println(str.charAt(3));

        // if we want to access the range of string
        for(int i=0;i<14;i++){// it also print the space and space ka bhi indexing hoga
            System.out.print(str.charAt(i));
        }

        //2-> .length()-> length of string
        System.out.println();
        int n=str.length();
        System.out.println(n);

        //3-> .indexOf()-> it gives the first occurence of index of a character of a given string
        System.out.println(str.indexOf('c'));

        //4-> .lstIndexOf()-> it gives the last index of character of a string
        System.out.println(str.lastIndexOf('c'));

        //5-> .compareTo()-> it is used to compare two strings lexographically
        String s1="afc";
        String s2="abc";
        System.out.println(s1.compareTo(s2));
        //if both has same size and sane character then it provides 0
        //esme ascii valu ko substract karte hai
        String s3="afc";
        String s4="afc";
        System.out.println(s3.compareTo(s4));
        //if s1 ka length big hai to aur s2 ka character same ho s1 ke tab jo extra character hai s1 me hota wahi positive answer deta hai
        String s5="afcfhfjp";
        String s6="afc";
        System.out.println(s5.compareTo(s6));
        //if s2 ka length big hai to aur s1 ka character same ho s2 ke tab jo extra character hai s2 me hota wahi negative  answer deta hai
        String s7="afc";
        String s8="afccfgjhdfyk";
        System.out.println(s7.compareTo(s8));

        //6-> contains()-> it check the substring is present in the given string and it gives true or false
        String s9="My collage name is galgotias university";
        System.out.println(s9.contains("gal"));//true

        //7-> startsWith()-> check start with substring
        String s10="My collage name is galgotias university";
        System.out.println(s10.startsWith("coll"));//false

        //8-> endsWith()-> check end with substring
        String s11="My collage name is galgotias university";
        System.out.println(s11.endsWith("sity"));//true

        //9-> toLowerCase-> it convert the given string to upper case
        String a="My collage name is galgotias university";
        // a.toUpperCase(); -> it means nothing
        //System.out.println(a.toUpperCase());
        String a1=a.toUpperCase();
        System.out.println(a1);

        //10-> toLowerCase-> it convert the given string to lower case
        String b="My collage name is galgotias university";
        // b.toLowerCase(); -> it means nothing
        //System.out.println(a.toUpperCase());
        String b1=b.toLowerCase();
        System.out.println(b1);

        //11-> concat-> it used to add the two string
        String c="My collage name is galgotias university ";
        String d="it is good university";
        //System.out.println(c.concat(d));
        String c1=c.concat(d);
        System.out.println(c1);
    }
}
