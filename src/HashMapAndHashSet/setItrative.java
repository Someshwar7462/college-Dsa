package HashMapAndHashSet;

import java.util.HashSet;

public class setItrative {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        s.add(1);
        s.add(20);
        s.add(5);
        s.add(0);
        System.out.println(s+" "+s.size());
        //only use for each loop not for loop bcz it has no concept of index in set so we use only for each loop
        for(int ele:s) System.out.print(ele + " ");
        System.out.println();

        //set contains only unique element means each element occur one time ,if we add element which is already present in set then
        //this element can not add in set, and it also not increase the size of set

        s.add(20);//it can not be added in set bcz 20 is already present in set
        System.out.println(s+" "+s.size());

    }
}
