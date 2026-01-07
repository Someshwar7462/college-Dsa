package HashMapAndHashSet;

import java.util.HashMap;

public class BasicMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();//it contains key value pairs
        //insertion T.C=O(1)   insertion (key,value) pairs /update also
        //it also contains 2 or more keys having same values but keys are unique
        map.put("Somu",23);
        map.put("Anu",56);
        map.put("Nicky",78);
        map.put("Raj",67);
        map.put("Priyanshu",90);
        map.put("Divyanshu",98);
        System.out.println(map+" "+map.size());//give size in constant time
        map.put("Somu",99);// put also updates the value of key if already key is exist
        map.put("Rohit",78);
        System.out.println(map+" "+map.size());
        System.out.println(map.containsKey("Raj"));//true
        System.out.println(map.containsKey("Ashu"));//false
        System.out.println(map.containsValue(90));
        System.out.println(map.containsValue(78));
        map.put("Somu",99);//it is not gives error not add in map and not update in size of map
        System.out.println(map+" "+map.size());
        map.remove("Raj");//delete the pairs
        System.out.println(map+" "+map.size());
        System.out.println(map.get("Rohit"));//gives the value of key
        System.out.println(map.keySet());// to print the all key in a map
        System.out.println(map.entrySet());// to print the pairs(key,value)

    }
}
