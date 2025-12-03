package Arrays;

public class   mergetwosoretdarray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 79, 97, 100};
        int[] brr = {67, 78, 89, 91, 94};
        int m = arr.length;
        int n = brr.length;
        int[] crr = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (arr[i] <= brr[j]) {
                crr[k] = arr[i];
                i++;
                k++;
            } else {
                crr[k] = brr[j];
                j++;
                k++;
            }
        }
        //for last element ya if one array is khatam
        if(i==m){//only b array store in c array bcz a array is end
            while(j<n){
                crr[k]=brr[j];
                j++;k++;
            }
        }
        if(j==n){//only a array store in c array bcz b array is end
            while(i<m){
                crr[k]=arr[i];
                i++;k++;
            }
        }
        for(int l=0;l<crr.length;l++){
            System.out.print(crr[l]+" ");
        }
    }
}
