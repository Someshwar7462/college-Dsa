package AMCAT;

public class countevenno {
    public static int count(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,-44,5,6,18,-7,8};
        System.out.println(count(arr));
    }
}
