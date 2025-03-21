package Arrays;

public class copyofarray {
    public static void main(String[] args) {
        int[] arr={34,12,67,56,17};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] nums=arr;//shallow copy-> it means previous array has two name one is arr and other is nums due to this if
        // we change in nums array then this change is also occured in arr array
        nums[0]=100;
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println("After the change in nums array print the arr array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
