package Arrays;
import java.util.Arrays;
public class buildinmethod {
    public static void main(String[] args) {
        int[] arr={20,56,12,78,1};
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
