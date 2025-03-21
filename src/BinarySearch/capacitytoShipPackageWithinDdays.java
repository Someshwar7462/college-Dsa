package BinarySearch;

public class capacitytoShipPackageWithinDdays {
    public static boolean IsPossible(int minC,int D,int[] arr) {
        int load = 0;
        int days = 1;
        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] <=minC) load += arr[i];
            else {
                load = arr[i];
                days++;
            }
        }
        if(days<=D) return true;
        else return false;
    }
        public static void main (String[]args){
            //leetcode=1011
            int[] arr = {1,2,3,4,5,6,7,8,9,10};
            int n = arr.length;
            int D = 3;
            int mx = Integer.MIN_VALUE;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                mx = Math.max(mx, arr[i]);
                sum += arr[i];
            }
            int low = mx;
            int minCapicity = 0;
            int high = sum;// to ship the all package in 1 day
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (IsPossible(mid, D, arr) == true) {
                    minCapicity = mid;
                    high = mid - 1;
                } else low = mid + 1;
            }
            System.out.println(minCapicity);
        }
    }
