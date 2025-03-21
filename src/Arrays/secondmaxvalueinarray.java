package Arrays;
public class secondmaxvalueinarray {
    public static void main(String[] args) {
        int[] arr={23,56,78,1,2,3,90};
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>max1)
               max1=arr[i];
        }
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max1){
                if(arr[i]>max2){
                    max2=arr[i];
                }
            }
        }
        System.out.println(max1);
        System.out.println(max2);

    }
}
