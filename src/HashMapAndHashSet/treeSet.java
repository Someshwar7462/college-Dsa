package HashMapAndHashSet;
import java.util.TreeSet;
public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tset=new TreeSet<>();
        //insert T.C=O(logn); it gives always in sorted order
        tset.add(200);
        tset.add(10);
        tset.add(2);
        tset.add(50);
        System.out.println(tset);

    }
}
