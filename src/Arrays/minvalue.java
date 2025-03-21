package Arrays;

public class minvalue {
    public static void main(String[] args) {
        int[] arr={34,67,-2,-3,-1,-9};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("min value is"+min);
//        int mn=Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<mn)
//                mn=arr[i];
//        }
//        System.out.println(mn);
    }
}
