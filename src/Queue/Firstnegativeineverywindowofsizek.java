package Queue;
import java.util.*;
public class Firstnegativeineverywindowofsizek {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        //brute force method
        ArrayList<Integer> list=new ArrayList<>();
         for(int i=0;i<=arr.length-k;i++){
             boolean flag=false;
             for(int j=i;j<i+k;j++){
                 if(arr[j]<0){
                     list.add(arr[j]);
                     flag=true;
                     break;
                 }
             }
             if(flag==false){
                 list.add(0);
             }
         }
         return list;

        //optimise approach
//        Queue<Integer> que=new LinkedList<>();
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<0) que.add(i);
//        }
//
//        for(int i=0;i<arr.length-k+1;i++){
//            if(que.size()!=0 && que.peek()<i) que.remove();
//            if(que.size()!=0 && que.peek()<=i+k-1) list.add(arr[que.peek()]);
//            else que.add(0);
//        }
        //return list;
    }
    public static void main(String[] args) {
        //gfg
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(firstNegInt(arr, k)); // [-1, -1, -7, -15, -15, 0]
    }
}
