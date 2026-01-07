package HashMapAndHashSet;

import java.util.HashMap;

public class InterativeInMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();//it contains key value pairs
        //insertion T.C=O(1)   insertion (key,value) pairs /update also
        //it also contains 2 or more keys having same values but keys are unique
        map.put("Somu",23);
        map.put("Anu",56);
        map.put("Nicky",67);
        map.put("Raj",67);
        map.put("Priyanshu",90);
        map.put("Divyanshu",98);
        System.out.println(map);
        //iterate using key : we can get both key and value
        for(String key:map.keySet()){
            int value=map.get(key);
            System.out.println(key+" "+value);
        }
        //iterate using value: we can get only value
        for(int ele:map.values()){
            System.out.println(ele);
        }

    }
}
