package HashMapAndHashSet;

import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> map=new TreeMap<>();//it contains key value pairs
        //insertion T.C=O(logn)   insertion (key,value) pairs /update also
        //it also contains 2 or more keys having same values but keys are unique
        //it gives in sorted order and sorted using character ascii value
        map.put("Somu",23);
        map.put("Anu",56);
        map.put("Nicky",78);
        map.put("Raj",67);
        map.put("Priyanshu",90);
        map.put("Divyanshu",98);
        System.out.println(map+" "+map.size());
        for(String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}
