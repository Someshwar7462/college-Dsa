package HashMapAndHashSet;
import java.util.HashSet;
public class basicset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        //insert T.C=O(1);
        set.add(200);
        set.add(10);
        set.add(2);
        set.add(50);
        System.out.println(set+" "+set.size());
        //size() T.C=O(1);
        set.remove(10); //remove() T.C=O(1)
        set.add(34);
        System.out.println(set+" "+set.size());
        //contains() T.C=O(1);
        System.out.println(set.contains(23));
        System.out.println(set.contains(2));

        //toArray
        Object[] arr=set.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");
        }


    }
}
