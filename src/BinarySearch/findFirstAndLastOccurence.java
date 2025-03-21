package BinarySearch;

public class findFirstAndLastOccurence {
//    public static void BN(int[] arr,int low,int high,int target){
//        int n=arr.length;
//        int firstOccu=n,lastOccu=n;
//        while(low<=high){
//            int mid=(low+high)/2;
//            //first position
//            if(arr[mid]==target){
//                if(arr[mid-1]==target) high=mid-1;
//                else {
//                    firstOccu=mid;
//                    break;
//                }
//            }
//            else if(arr[mid]>target) high=mid-1;
//            else low=mid+1;
//            //last position
//            if(arr[mid]==target){
//                if(arr[mid]==arr[mid+1]) low=mid+1;
//                else{
//                    lastOccu=mid;
//                    break;
//                }
//            }
//            else if(arr[mid]>target) high=mid-1;
//            else low=mid+1;
//        }
//        System.out.println(firstOccu+" "+(lastOccu-1));
//    }
    public static void main(String[] args) {
        //leetcode=34
        int[] arr={10,20,20,20,20,20,20,30,30,50,60,70};
        int n=arr.length;
        int target=20;
         int firstOccu=n,lastOccu=n;
        int low=0,high=n-1;
        boolean flag=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                flag=true;
                break;
            }
            else if(arr[mid]>target) high=mid-1;
            else low=mid+1;
        }
        if(flag==false) System.out.println("target is not present");
        else System.out.println("target is present");
        //first occurence
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                firstOccu=Math.min(firstOccu,mid);
                high=mid-1;
            }
            else low=mid+1;
        }
        //last occurence
        low=0; high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                lastOccu=Math.min(lastOccu,mid);
                high=mid-1;
            }
            else low=mid+1;
        }
       //BN(arr,0,n-1,target);
        System.out.println(firstOccu+" "+(lastOccu-1));
    }
}
