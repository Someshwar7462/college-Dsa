package Arrays.ArrayList;
import java.util.ArrayList;
public class basicofarraylist {
    public static void main(String[] args) {
        //int[] arr=new int[6];
        ArrayList<Integer> arr=new ArrayList<>(6);
        System.out.println(arr);
        //to initilise the arraylist
        arr.add(0,23);//arr[0]=23;
        arr.add(1,56);
        arr.add(2,90);
        arr.add(3,45);
        arr.add(4,3);
        arr.add(5,2);
        // print the arraylist elements
        System.out.println(arr);
        // size of arraylist
        System.out.println(arr.size());
        //also print the elements using loop
//        for(int i=0;i<arr.size();i++){
//            System.out.print(arr.get(i)+" ");
//        }
        //update the elements
        arr.set(3,78);//update the value
        System.out.println(arr);
        //add extra elements
        arr.add(100);//by deafult it added at last position
        System.out.println(arr);
        System.out.println(arr.size());
        //add extra elements
        arr.add(4,200);
        System.out.println(arr);
        System.out.println(arr.size());
        arr.remove(7);
        System.out.println(arr);
        System.out.println(arr.size());
    }
}
