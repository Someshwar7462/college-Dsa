package HashMapAndHashSet;

import java.util.HashMap;

public class CountTheFreqInArrayEle {
    public static void countfreq(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int freq=map.get(arr[i]);
                map.put(arr[i],freq+1);
            }else map.put(arr[i],1);
        }
        //print the map
        for(int ele:map.keySet()){
            int value=map.get(ele);
            System.out.println("("+ele+","+value+")");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,2,3,1,1,6,7};
        countfreq(arr);
    }
}
