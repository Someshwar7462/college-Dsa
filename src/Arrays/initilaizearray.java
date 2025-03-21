package Arrays;

public class initilaizearray {
    public static void main(String[] args) {
        int[] arr={11,2,3,4,5,78,-90};
        System.out.println(arr[4]);
        //update bhi kar sakte hai
        arr[5]=89;
        System.out.println(arr[5]);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
