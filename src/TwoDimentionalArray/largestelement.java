package TwoDimentionalArray;

public class largestelement {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{11,-45,67},{12,61,46}};
        int m=arr.length;
        int n=arr[0].length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]>mx){
                    mx=arr[i][j];
                }
            }
        }
        System.out.println("largest element is "+mx);
    }
}
