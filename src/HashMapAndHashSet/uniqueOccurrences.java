package HashMapAndHashSet;

import java.util.HashMap;
import java.util.HashSet;

public class uniqueOccurrences {
    public static boolean Unique(int[] arr){
        //LeetCode: 1207
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int freq=map.get(arr[i]);
                map.put(arr[i],freq+1);
            }else map.put(arr[i],1);
        }
        for(int ele:map.keySet()){
            int val=map.get(ele);
            set.add(val);
        }
        if(map.size()!=set.size()) return false;
        else return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,1,1,3};
        System.out.println(Unique(arr));
    }
}
