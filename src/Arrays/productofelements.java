package Arrays;
public class productofelements {
    public static void main(String[] args) {
        int[] arr={2,45,6,7,8,34,9,3};
        int product=1;
        for(int i=0;i<arr.length;i++){
            product*=arr[i];
        }
        System.out.println("Product of elements is "+product);
    }
}
