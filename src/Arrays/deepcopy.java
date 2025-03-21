package Arrays;
import java.util.Arrays;
public class deepcopy {
    public static void main(String[] args) {
        int[] arr={23,45,66,12,22};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] nums=Arrays.copyOf(arr,arr.length);//deep copy-> means if we change in nums array then in original array arr
        // not change ; it means here it is two different array
        nums[0]=90;
        System.out.println("After change in nums array");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println("After change in nums array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
