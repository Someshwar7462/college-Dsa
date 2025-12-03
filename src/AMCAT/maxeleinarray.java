package AMCAT;

public class maxeleinarray {
    public static int find(int[] arr){
        if(arr.length==0) return -1;
        int max=arr[1];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,-13,45,0};
        System.out.println(find(arr));

    }
}
