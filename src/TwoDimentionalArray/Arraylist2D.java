package TwoDimentionalArray;
import java.util.ArrayList;
public class Arraylist2D {
    public static void main(String[] args) {
        //declaration and intilization
         //ArrayList<Integer> list=new ArrayList<>(); //for  1D array
        //ArrayList<ArrayList<Integer>> list1=new ArrayList<>();//for 2D array
        //now we can store the multiple 1D arraylist with different size in 2D arraylist
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10); arr.add(20); arr.add(30);//->arr={10,20,30}
//        for(int i=0;i<arr.size();i++){
//            System.out.print(arr.get(i)+" ");
//        }
        ArrayList<Integer> brr=new ArrayList<>();
        brr.add(23); brr.add(56);//->brr={23,56}
        ArrayList<Integer> crr=new ArrayList<>();//empty arrayList
        ArrayList<Integer> drr=new ArrayList<>();
        drr.add(89);//drr={89}
        //now store the above arrayList in 2D arrayList
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        res.add(arr); res.add(brr); res.add(crr); res.add(drr);
        //System.out.println(res);
        //print res 2D arraylist using loop
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i)+" ");
        }
        //excess an unique element
        System.out.print(res.get(1).get(1));
    }
}
