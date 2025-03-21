package Arrays;

public class maxvalue {
    public static void main(String[] args) {
        int[] arr={-3,-12,-67,-25,-34};
        //method 1
//        int maxvalue=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>maxvalue)
//                maxvalue=arr[i];
//        }
//        System.out.println("max element is "+maxvalue);

        //method 2-> if negative element is not +nt
//        int max=-1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max)
//                max=arr[i];
//        }
//        System.out.println(max);

        //best method work in any situation
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            //if(arr[i]>mx)  mx=arr[i];
            mx=Math.max(mx,arr[i]);//replacement of if statement using library
        }
        System.out.println("max value is "+mx);
    }
}
