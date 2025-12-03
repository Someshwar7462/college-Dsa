package AMCAT;

public class IIndlargest {
    public static int second(int[] arr){
        int secMax=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secMax){
                secMax=arr[i];
                continue;
            }


        }
        return secMax;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(second(arr));
    }
}
