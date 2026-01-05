package HashMapAndHashSet;

import java.util.HashSet;

public class CountNumberofDistinctIntegersAfterReverseOperations {
    public static int reverse(int n){
        if(n<10) return n;
        int rev=0;
        while(n!=0){
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        return rev;
    }
    public static int countdistinct(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            int rev=reverse(arr[i]);
            set.add(rev);
        }
        return set.size();
    }
    public static void main(String[] args) {
        //LeeCode :2442
        int[] arr={1,13,10,12,31};
        System.out.println(countdistinct(arr));
    }
}
